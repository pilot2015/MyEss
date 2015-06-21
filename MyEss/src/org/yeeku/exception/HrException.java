package org.yeeku.exception;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class HrException extends Exception
{
    private String msg;

    public HrException()
    {
    }

    public HrException(String msg)
    {
        super( msg );
    }
}