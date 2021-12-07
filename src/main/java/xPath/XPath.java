package xPath;


public final class XPath  {
    // StartPage
    public static final String LOGIN_BUTTON = "//div[@class='top-buttons']/button[2]";
    public static final String LOGIN_FULL_SIZE_ICON = "//i[@class='top-login-full sprite-fm-mono icon-new-window']";
    // Login Page
    public static final String LOGIN_FIELD = "#login-name2";
    public static final String PASSWORD_FIELD = "#login-password2";
    public static final String CONFIRM_LOGIN_BTN = "//button[@class='mega-button positive login-button large right']";
    public static final String INCORRECT_PASS_MASSAGE = "//h3[contains(text(), 'Invalid email and/or password. Please try again.')]";
    public static final String SKIP_SPAM_BTN = "//div[@class='mega-button large positive free-button']";
    // Register Page
    public static final String REGISTER_BUTTON = "//button[@class='mega-button branded-red create-account-button']";
    public static final String REGISTER_FIRST_NAME = "#register-firstname-registerpage2";
    public static final String REGISTER_LAST_NAME = "#register-lastname-registerpage2";
    public static final String REGISTER_EMAIL = "#register-email-registerpage2";
    public static final String REGISTER_PASSWORD = "#register-password-registerpage2";
    public static final String REGISTER_PASSWORD_CONFIRM = "#register-password-registerpage3";
    public static final String REGISTER_CHECKBOX_FIRST = "//div[@class='understand-check checkboxOff checkbox v-top']";
    public static final String REGISTER_CHECKBOX_SECOND = "//input[@name='register-check2']/parent::div";
    public static final String REGISTER_CONFIRM_BUTTON = "//button[@tabindex='8']";
    // MyFiles Page
    public static final String UPLOAD_FILE_BTN_DROP_DOWN = "//div[@class='button link-button dropdown fm-uploads']";
    public static final String UPLOAD_FILE_BTN = "//button[@class='fm-file-upload dropdown-btn']";
    public static final String ELEMENT_DOWNLOAD = "//div[contains(text(),'100%')]";
    public static final String ELEMENT_TO_DELETE = "//a/span[contains(text(),'test2.mp4')]";
    public static final String GARBAGE_ICON = "//button/div/i[@class='sprite-fm-mono icon-bin']";
    public static final String BTN_TO_RUBBISH_PAGE = "//button[@class='btn-myfiles js-lpbtn rubbish-bin js-fm-tab ui-droppable filled']";
    // Rubbish Page
    public static final String CONFIRM_DELETE_BUTTON = "//div/div/button[@class='mega-button positive confirm']";
    public static final String CONFIRM_DELETE_BUTTON_ON_RUBBISH_PAGE = "//*[@id='msgDialog']/footer/div/button[2]";
    // MailPage
    public static final String CUSTOM_MAIL_BTN = "//div[@id='choose']";
    public static final String CUSTOM_MAIL_INPUT = "//input[@placeholder='Выберите имя']";
    public static final String AGREE_MAIL_BTN = "//div[@id='create']";
    // MailInBox
    public static final String EMAIL = "//div[@class='email']";
    public static final String REFRESH_BTN = "//a[@href='/ru/refresh']";
    public static final String TIMER_ELEMENT = "//div[contains(text(),'44:53')]";
    public static final String CONFIRM_MAIL_BTN = "//a[contains(text(),'MEGA Email Verification Required')]";
    public static final String CONFIRM_PAGE_SRC = "//div[@class='body']/iframe";
    // MailMassagePage
    public static final String ACTIVATE_ACC_BTN = "//a[contains(text(),'Activate account')]";



}
