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
// Generated from file `CartService.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package cn.purchasenear.v1.cart.ice.interf;

public abstract class Callback_CartService_addCart extends Ice.TwowayCallback
{
    public abstract void response(OpCartInfo __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        CartServicePrx __proxy = (CartServicePrx)__result.getProxy();
        OpCartInfo __ret = null;
        try
        {
            __ret = __proxy.end_addCart(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
