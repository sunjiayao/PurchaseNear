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
// Generated from file `GoodsService.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package cn.purchasenear.v1.goods.rpcservice.ice.interf.goods;

public interface _GoodsSearchServiceDel extends Ice._ObjectDel
{
    SearchGoods search(SearchInfo info, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;
}
