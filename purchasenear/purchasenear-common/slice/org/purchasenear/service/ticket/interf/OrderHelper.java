// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `TicketServer.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package org.purchasenear.service.ticket.interf;

public final class OrderHelper
{
    public static void write(Ice.OutputStream __outS, Order __v)
    {
        __v.ice_write(__outS);
    }

    public static Order read(Ice.InputStream __inS)
    {
        Order __v = new Order();
        __v.ice_read(__inS);
        return __v;
    }

    public static Ice.OptionalFormat optionalFormat()
    {
        return Ice.OptionalFormat.FSize;
    }
}
