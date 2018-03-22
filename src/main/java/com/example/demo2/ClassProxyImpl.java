package com.example.demo2;
/**
 * Created by Bartlomiej Wichowski Date: 3/22/2018 Time: 3:16 PM
 */

import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 *
 */
@Service
public class ClassProxyImpl extends ClassProxy {
    @Override
    boolean getData() {
        return  TransactionSynchronizationManager.isActualTransactionActive();
    }
}
