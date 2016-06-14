package com.hipay.hipayfullservice.core.requests.payment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nfillion on 22/02/16.
 */
public class QiwiWalletPaymentMethodRequestTest {

    private QiwiWalletPaymentMethodRequest qiwiWalletPaymentMethodRequest;

    @Before
    public void setUp() throws Exception {

        qiwiWalletPaymentMethodRequest = new QiwiWalletPaymentMethodRequest();
    }

    @Test
    public void testGetters() throws Exception {

        qiwiWalletPaymentMethodRequest.getUsername();
    }

    @Test
    public void testSetters() throws Exception {

        qiwiWalletPaymentMethodRequest.setUsername(null);
    }
}