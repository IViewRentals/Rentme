/**
 * define AjaxResult class for the interaction between frontend and backend
 *
 * @author rentme
 */

package com.example.rentsummary.model;

import com.example.rentsummary.utils.StringUtils;

import java.util.HashMap;

/**
 * operation message remind
 *
 * @author rentme
 */
public class AjaxResult extends HashMap<String, Object>
{
    private static final long serialVersionUID = 1L;

    /** state code */
    public static final String CODE_TAG = "code";

    /** return content */
    public static final String MSG_TAG = "msg";

    /** data object */
    public static final String DATA_TAG = "data";

    /**
     * state type
     */
    public enum Type
    {
        /** SUCCESS */
        SUCCESS(0),
        /** WARN */
        WARN(301),
        /** ERROR */
        ERROR(500);
        private final int value;

        Type(int value)
        {
            this.value = value;
        }

        public int value()
        {
            return this.value;
        }
    }

    /**
     * Initialize a newly created Ajax result object to represent an empty message
     */
    public AjaxResult()
    {
    }

    /**
     * nitialize a newly created Ajax result object
     *
     * @param type state type
     * @param msg return content
     */
    public AjaxResult(Type type, String msg)
    {
        super.put(CODE_TAG, type.value);
        super.put(MSG_TAG, msg);
    }

    /**
     * nitialize a newly created Ajax result object
     *
     * @param type state content
     * @param msg return content
     * @param data data object
     */
    public AjaxResult(Type type, String msg, Object data)
    {
        super.put(CODE_TAG, type.value);
        super.put(MSG_TAG, msg);
        if (StringUtils.isNotNull(data))
        {
            super.put(DATA_TAG, data);
        }
    }

    /**
     * Convenient chain call
     *
     * @param key
     * @param value
     * @return data object
     */
    @Override
    public AjaxResult put(String key, Object value)
    {
        super.put(key, value);
        return this;
    }

    /**
     * return success message
     *
     * @return Success message
     */
    public static AjaxResult success()
    {
        return AjaxResult.success("操作成功");
    }

    /**
     * return success message
     *
     * @return Success message
     */
    public static AjaxResult success(Object data)
    {
        return AjaxResult.success("操作成功", data);
    }

    /**
     * return uccess message
     *
     * @param msg return content
     * @return Success message
     */
    public static AjaxResult success(String msg)
    {
        return AjaxResult.success(msg, null);
    }

    /**
     * return uccess message
     *
     * @param msg return content
     * @param data data object
     * @return Success message
     */
    public static AjaxResult success(String msg, Object data)
    {
        return new AjaxResult(Type.SUCCESS, msg, data);
    }

    /**
     * return warn message
     *
     * @param msg return content
     * @return warn message
     */
    public static AjaxResult warn(String msg)
    {
        return AjaxResult.warn(msg, null);
    }

    /**
     * return warn message
     *
     * @param msg return content
     * @param data data object
     * @return warn message
     */
    public static AjaxResult warn(String msg, Object data)
    {
        return new AjaxResult(Type.WARN, msg, data);
    }

    /**
     * return error message
     *
     * @return
     */
    public static AjaxResult error()
    {
        return AjaxResult.error("操作失败");
    }

    /**
     * return error message
     *
     * @param msg return content
     * @return error message
     */
    public static AjaxResult error(String msg)
    {
        return AjaxResult.error(msg, null);
    }

    /**
     * return error message
     *
     * @param msg return content
     * @param data data object
     * @return error message
     */
    public static AjaxResult error(String msg, Object data)
    {
        return new AjaxResult(Type.ERROR, msg, data);
    }
}
