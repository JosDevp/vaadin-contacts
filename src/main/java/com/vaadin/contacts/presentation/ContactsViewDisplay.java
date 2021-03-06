package com.vaadin.contacts.presentation;

import com.vaadin.contacts.InstanceTracker;
import com.vaadin.contacts.presentation.contact.Presenter;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.ui.CustomComponent;
import javax.interceptor.Interceptors;

@Interceptors(InstanceTracker.class)
public class ContactsViewDisplay extends CustomComponent implements ViewDisplay {

    private static final long serialVersionUID = -8477213635492997536L;

    public ContactsViewDisplay() {
        setSizeFull();
    }

    @Override
    public void showView(View view) {
        setCompositionRoot(((Presenter) view).getView());
    }
}
