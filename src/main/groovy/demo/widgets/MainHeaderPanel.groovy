package demo.widgets

import com.vaadin.navigator.View
import com.vaadin.server.Sizeable
import com.vaadin.ui.Alignment
import com.vaadin.ui.Button
import com.vaadin.ui.HorizontalLayout
import com.vaadin.ui.Label
import com.vaadin.ui.MenuBar
import com.vaadin.ui.Panel
import com.vaadin.ui.VerticalLayout
import com.vaadin.ui.themes.ValoTheme


/**
 * Created by a54 on 24.01.2018.
 */
class MainHeaderPanel extends HorizontalLayout {

    public MainHeaderPanel(){
        HorizontalLayout content = this
        content.setWidth(100,Sizeable.Unit.PERCENTAGE)
        //this.setHeight(100, Sizeable.Unit.PIXELS)
        //content.setHeight(100, Sizeable.Unit.PIXELS)
        //content.setWidthUndefined()

        Label appDesc = new Label("Новая APP")
        appDesc.setWidth(100,Sizeable.Unit.PIXELS)
        content.addComponent(appDesc)


        MenuBar mainMenu = new MenuBar()
        mainMenu.addStyleName(ValoTheme.MENUBAR_BORDERLESS)

        MenuBar.MenuItem product = mainMenu.addItem("Продукты", null)

            product.addItem("Железка",null)
            product.addItem("Деревяшка",null)
            product.addItem("Стекляшка",null)

        MenuBar.MenuItem docs = mainMenu.addItem("док",null)
        MenuBar.MenuItem blah = mainMenu.addItem("просто место",null)

        content.addComponent(mainMenu)


//        Panel placeHolder = new Panel()
//        placeHolder.setSizeFull()
//
//        content.addComponent(placeHolder)


        Button buttonLk = new Button("=")
        buttonLk.addStyleName(ValoTheme.BUTTON_BORDERLESS)


        content.addComponent(buttonLk)
        content.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT)
        content.setComponentAlignment(mainMenu,Alignment.MIDDLE_LEFT)
        content.setComponentAlignment(buttonLk, Alignment.MIDDLE_RIGHT)

    }



}
