/*
 * *
 *  *
 *  * Copyright (c) 2017 by Beijing Chuang Xin Qu Cheng Technology Co., Ltd
 *  * All rights reserved.
 *  *
 *  * The information contained herein is confidential and proprietary to
 *  * Beijing Beijing Chuang Xin Qu Cheng Technology Co., Ltd, and
 *  * considered a trade secret as defined under civil and criminal statutes.
 *  * Beijing Chuang Xin Qu Cheng Technology Co., Ltd shall pursue its
 *  * civil and criminal remedies in the event of unauthorized use or
 *  * misappropriation of its trade secrets.  Use of this information
 *  * by anyone other than authorized employees of Beijing Chuang Xin Qu Cheng
 *  * Technology Co., Ltd is granted only under a written non-disclosure
 *  * agreement, expressly prescribing the scope and manner of such use.
 *  *
 *
 */

package com.lx.pop.common;

import java.text.SimpleDateFormat;

/**
 * Created by Queen on 2016/12/13.
 */
public class TransBase<T extends BaseDto,E extends BaseEntity> {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public  void toEntity(T t,E e){
        e.setId(t.getId());
        e.setcUser(t.getcUser());
        e.setcTime(t.getcTime());
        e.setUptUser(t.getUptUser());
        e.setUptTime(t.getUptTime());
        e.setIsDel(t.getIsDel());
        e.setType(t.getType());
        e.setFlag(t.getFlag());
        e.setStatus(t.getStatus());
    }

    public void toDto(T t,E e){
        t.setId(e.getId());
        t.setcUser(e.getcUser());
        t.setcTime(e.getcTime());
        t.setUptUser(e.getUptUser());
        t.setUptTime(e.getUptTime());
        t.setIsDel(e.getIsDel());
        t.setType(e.getType());
        t.setFlag(e.getFlag());
        t.setStatus(e.getStatus());
    }
}
