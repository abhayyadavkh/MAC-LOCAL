package com.hybris.training.backoffice.widgets.mychat;

import com.hybris.cockpitng.annotations.SocketEvent;
import com.hybris.cockpitng.annotations.ViewEvent;
import com.hybris.cockpitng.util.DefaultWidgetController;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;

public class MyChatController extends DefaultWidgetController
{
    private Label lastMsgLabel;
    private Textbox msgInput;

    @ViewEvent(componentID = "sendBtn", eventName = Events.ON_CLICK)
    public void sendMsg()
    {
        sendOutput("outgoingMsg", msgInput.getText());

    }

    @SocketEvent(socketId = "incomingMsg")
    public void updateTranscript(final String msg)
    {
        lastMsgLabel.setValue(msg);
    }
}
