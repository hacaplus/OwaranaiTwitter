package com.golden.owaranai.twitter;

import twitter4j.Status;

/**
 * Created by soomin on 3/26/2014.
 */
public class StatusItem {
        public String id;
        public Status status;

        public StatusItem(Status status) {
            this.id = String.valueOf(status.getId());
            this.status = status;
        }
}
