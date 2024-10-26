package com.spark.dynamic.dynamic_query; // Adjust to your package

import org.hibernate.EmptyInterceptor;
import org.hibernate.Transaction;

public class SqlLoggingInterceptor extends EmptyInterceptor {
    @Override
    public void beforeTransactionCompletion(Transaction tx) {
        super.beforeTransactionCompletion(tx);
    }
}
