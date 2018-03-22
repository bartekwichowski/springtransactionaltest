package com.example.demo2;
/**
 * Created by Bartlomiej Wichowski Date: 3/22/2018 Time: 3:16 PM
 */

import org.springframework.transaction.annotation.Transactional;

/**
 *
 */
@Transactional
public abstract class ClassProxy {
    abstract boolean getData();
}
