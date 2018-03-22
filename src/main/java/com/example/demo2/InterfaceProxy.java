package com.example.demo2;
/**
 * Created by Bartlomiej Wichowski Date: 3/22/2018 Time: 2:59 PM
 */

import org.springframework.transaction.annotation.Transactional;

/**
 *
 */
@Transactional
public interface InterfaceProxy {
    boolean getData();
}
