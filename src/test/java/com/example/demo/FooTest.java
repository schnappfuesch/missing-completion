package com.example.demo;

import static org.hamcrest.CoreMatchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FooTest {
	@Autowired
	private Foo foo;

	@Test
	public void isFoo() {
		MatcherAssert.assertThat(foo.getBar(), equalTo("test"));
	}
}
