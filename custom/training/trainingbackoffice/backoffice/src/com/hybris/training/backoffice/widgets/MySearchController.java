package com.hybris.training.backoffice.widgets;

import com.hybris.cockpitng.annotations.ViewEvent;
import com.hybris.cockpitng.util.DefaultWidgetController;
import com.hybris.training.backoffice.service.SearchService;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;

import java.util.List;

public class MySearchController extends DefaultWidgetController
{
    private Textbox searchInput;

    @WireVariable
    private SearchService searchService;

    @ViewEvent(componentID = "searchBtn", eventName = Events.ON_CLICK)
    public void doSearch() throws InterruptedException
    {
        List<String> result = searchService.search(searchInput.getText());
        Messagebox.show(result.get(0));
    }
}