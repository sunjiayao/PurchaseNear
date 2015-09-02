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
// Generated from file `UserService.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package cn.purchasenear.v1.user.regist;

public class ActivateInfo implements java.lang.Cloneable, java.io.Serializable
{
    public int status;

    public ActivateInfo()
    {
    }

    public ActivateInfo(int status)
    {
        this.status = status;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ActivateInfo _r = null;
        if(rhs instanceof ActivateInfo)
        {
            _r = (ActivateInfo)rhs;
        }

        if(_r != null)
        {
            if(status != _r.status)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::regist::ActivateInfo");
        __h = IceInternal.HashUtil.hashAdd(__h, status);
        return __h;
    }

    public java.lang.Object
    clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeInt(status);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        status = __is.readInt();
    }

    public static final long serialVersionUID = 1242104305L;
}
