package demo

import com.vaadin.data.HasValue
import com.vaadin.server.VaadinRequest
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.ui.Alignment
import com.vaadin.ui.Button
import com.vaadin.ui.TextField
import com.vaadin.ui.Notification
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import demo.widgets.MainHeaderPanel

@SpringUI(path="/vaadinUI")
public class DemoGrailsUI extends UI{
    @Override
    protected void init(VaadinRequest request) {

        VerticalLayout root = new VerticalLayout()

        root.addComponent(new MainHeaderPanel())


        root.setSizeFull()

        Button button = new Button("Click me!", {
            Notification.show("Hello from Vaadin 8 + Grails 3!", Notification.Type.ERROR_MESSAGE)
        } as Button.ClickListener)

        root.addComponent(button)


        TextField searchEditBox = new TextField("Text")
        searchEditBox.setPlaceholder("Поискать")
        //searchEditBox.updateCaption(0)
        root.addComponent(searchEditBox)


        searchEditBox.addValueChangeListener({event-> Notification.show("Value changed:",
                String.valueOf(event.getValue()),
                Notification.Type.ERROR_MESSAGE)} as HasValue.ValueChangeListener)

        root.setComponentAlignment(button, Alignment.MIDDLE_CENTER)

        setContent(root)
    }
}
