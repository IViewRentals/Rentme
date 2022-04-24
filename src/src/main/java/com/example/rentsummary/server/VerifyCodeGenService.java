package com.example.rentsummary.server;


import com.example.rentsummary.model.VerifyCode;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Verification code generation interface
 */
public interface VerifyCodeGenService {
    /**
     * Generate the verification code and return the code, and write the picture into the os
     *
     * @param width
     * @param height
     * @param os
     * @return
     * @throws IOException
     */
    String generate(int width, int height, OutputStream os) throws IOException;

    /**
     * Create a verification code object
     *
     * @param width
     * @param height
     * @return
     * @throws IOException
     */
    VerifyCode generate(int width, int height) throws IOException;
}
