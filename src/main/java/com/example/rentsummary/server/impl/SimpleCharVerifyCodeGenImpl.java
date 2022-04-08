package com.example.rentsummary.server.impl;


import com.example.rentsummary.model.VerifyCode;
import com.example.rentsummary.server.VerifyCodeGenService;
import com.example.rentsummary.utils.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * 
 */
public class SimpleCharVerifyCodeGenImpl implements VerifyCodeGenService {

    private static final Logger logger = LoggerFactory.getLogger(SimpleCharVerifyCodeGenImpl.class);

    private static final String[] FONT_TYPES = {"\u5b8b\u4f53", "\u65b0\u5b8b\u4f53", "\u9ed1\u4f53", "\u6977\u4f53", "\u96b6\u4e66"};

    private static final int VALICATE_CODE_LENGTH = 4;

    /**
     * Set the background color and size, interference lines
     *
     * @param graphics
     * @param width
     * @param height
     */
    private static void fillBackground(Graphics graphics, int width, int height) {
        // fill background
        graphics.setColor(Color.WHITE);
        //Set rectangle coordinates x y to 0
        graphics.fillRect(0, 0, width, height);

        // Add distraction lines
        for (int i = 0; i < 8; i++) {
            //Set random color algorithm parameters
            graphics.setColor(RandomUtils.randomColor(40, 150));
            Random random = new Random();
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int x1 = random.nextInt(width);
            int y1 = random.nextInt(height);
            graphics.drawLine(x, y, x1, y1);
        }
    }

    /**
     * Generate random characters
     *
     * @param width
     * @param height
     * @param os
     * @return
     * @throws IOException
     */
    @Override
    public String generate(int width, int height, OutputStream os) throws IOException {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        fillBackground(graphics, width, height);
        String randomStr = RandomUtils.randomString(VALICATE_CODE_LENGTH);
        createCharacter(graphics, randomStr);
        graphics.dispose();
        //Set JPEG format
        ImageIO.write(image, "JPEG", os);
        return randomStr;
    }

    /**
     * verification code generation
     *
     * @param width
     * @param height
     * @return
     */
    @Override
    public VerifyCode generate(int width, int height) {
        VerifyCode verifyCode = null;
        try (
            //Putting the initialization of the stream here eliminates the need to manually close the stream
            ByteArrayOutputStream baos = new ByteArrayOutputStream();) {
            String code = generate(width, height, baos);
            verifyCode = new VerifyCode();
            verifyCode.setCode(code);
            verifyCode.setImgBytes(baos.toByteArray());
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
            verifyCode = null;
        }
        return verifyCode;
    }

    /**
     * set the color format 
     *
     * @param g
     * @param randomStr
     */
    private void createCharacter(Graphics g, String randomStr) {
        char[] charArray = randomStr.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            //set rgb color parameter
            g.setColor(new Color(50 + RandomUtils.nextInt(100), 50 + RandomUtils.nextInt(100), 50 + RandomUtils.nextInt(100)));
            //set font size, type
            g.setFont(new Font(FONT_TYPES[RandomUtils.nextInt(FONT_TYPES.length)], Font.BOLD, 26));
            //set x y coordinates
            g.drawString(String.valueOf(charArray[i]), 15 * i + 5, 19 + RandomUtils.nextInt(8));
        }
    }
}
