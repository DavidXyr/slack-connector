package org.mule.modules.slack.client.exceptions;

/**
 * Created by estebanwasinger on 2/21/15.
 */
public class SlackException extends RuntimeException {
    public SlackException(String msg) {
        super(msg);
    }
}
