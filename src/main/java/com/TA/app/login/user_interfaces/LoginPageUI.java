package com.TA.app.login.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPageUI {

//    public static final Target ADMIN_IN_USERS_GRID = Target.the("admin in users grid")
//            .locatedBy("//tr[contains(@id, 'en-ztna-TableRow')][.//td[contains(@id, 'RowCell-role')][.='Admin']]//td[contains(@id, 'RowCell-email')]//span");

    public static final Target ADMIN_IN_USERS_GRID = Target.the("admin in users grid")
            .locatedBy("//tr[contains(@id, 'en-ztna-TableRow')][.//td[contains(@id, 'RowCell-role')][.='Admin']]//td[contains(@id, 'RowCell-email')]//span[.='{0}']");
}
