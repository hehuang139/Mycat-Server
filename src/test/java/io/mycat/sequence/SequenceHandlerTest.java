/*
 * Copyright (c) 2013, OpenCloudDB/MyCAT and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software;Designed and Developed mainly by many Chinese 
 * opensource volunteers. you can redistribute it and/or modify it under the 
 * terms of the GNU General Public License version 2 only, as published by the
 * Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Any questions about this component can be directed to it's project Web address 
 * https://code.google.com/p/opencloudb/.
 *
 */
package io.mycat.sequence;

import io.mycat.route.sequence.handler.IncrSequencePropHandler;
import io.mycat.route.sequence.handler.SequenceHandler;
import junit.framework.Assert;

/**
 * 全局序列号单元测试
 * 
 * @author <a href="http://www.micmiu.com">Michael</a>
 * @time Create on 2013-12-30 上午12:07:51
 * @version 1.0
 */
public class SequenceHandlerTest {

	//@Test
	public void testPropSequence() {
		SequenceHandler hander = IncrSequencePropHandler.getInstance();
		Assert.assertEquals(hander.nextId("DEF") - hander.nextId("DEF"), -1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SequenceHandler hander = IncrSequencePropHandler.getInstance();
		System.out.println(hander.nextId("DEF"));
	}

}