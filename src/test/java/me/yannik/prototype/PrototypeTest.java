/**
 * MIT License
 * <p>
 * Copyright (c) 2017 James
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package test.java.me.yannik.prototype;

import cgb.p6.designpattern.prototype1.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * 测试原型模式
 * by Yannik（焱坤）
 */
@RunWith(Parameterized.class)
public class PrototypeTest<P extends Prototype> {
    @Parameterized.Parameters
    public static Collection<Object[]> setupData() {
        return Arrays.asList(
                new Object[]{new VolkswagenDriver(), "这位大众车司机"},
                new Object[]{new VolkswagenVehicle(), "一辆大众车"},
                new Object[]{new VolkswagenPassanger(), "这位大众车乘客"},
                new Object[]{new BmwDriver(), "这位宝马车司机"},
                new Object[]{new BmwVehicle(), "一辆宝马车"},
                new Object[]{new BmwPassanger(), "这位宝马车乘客"}
        );
    }

    private final P prototype;
    private final String expectedString;

    public PrototypeTest(P prototype, String expectedString) {
        this.prototype = prototype;
        this.expectedString = expectedString;
    }

    @Test
    public void testPrototype() throws Exception {
        assertEquals(this.prototype.toString(), this.expectedString);
        final Object clone = this.prototype.clone();
        assertNotNull(clone);
        assertSame(clone.getClass(), this.prototype.getClass());
        assertNotSame(this.prototype, clone);
    }
}
