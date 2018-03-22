package com.example.demo2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {

    @Autowired
    InterfaceProxy interfaceProxy;

    @Autowired
    ClassProxy classProxy;

	@Test
	public void interfaceProxy() {
        Assert.assertTrue(interfaceProxy.getData());
	}

    @Test
    public void classProxy() {
        Assert.assertTrue(classProxy.getData());
    }

}
