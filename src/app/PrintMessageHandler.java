package app;

import netUtils.MessageHandler;

/**
 * Created by Alex on 31.03.2017.
 */
public class PrintMessageHandler implements MessageHandler {
    @Override
    public String handle(String message) {
        System.out.println(message);
        return "Ok";
    }
}
