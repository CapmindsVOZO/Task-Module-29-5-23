package com.taskmod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTask {
	public WebDriver driver;

	public PageTask(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "normal_login_username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "normal_login_password")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	@FindBy(xpath = "//a[@href='/popups/Tasks']//*[name()='svg']")
	private WebElement ClickTaskButton;

	public WebElement getClickTaskButton() {
		return ClickTaskButton;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[@class='App']/div[@class='app-body']/div[@class='task-container']/div[@id='task-block']/div[@class='tk-px-40']/div[@class='tk-cd-top-layer']/div[2]")
	private WebElement ClickEditButton;

	public WebElement getClickEditButton() {
		return ClickEditButton;
	}

	@FindBy(xpath = "(//input[@id='tsk_edt-inp_cat'])[1]")
	private WebElement EnterNewCategory;

	public WebElement getEnterNewCategory() {
		return EnterNewCategory;
	}

	@FindBy(xpath = "(//button[normalize-space()='New Category'])[1]")
	private WebElement ClickNewCategory;

	public WebElement getClickNewCategory() {
		return ClickNewCategory;
	}

	@FindBy(xpath = "//div[@class='add-task-close']//*[name()='svg']")
	private WebElement clickClose;

	public WebElement getclickClose() {
		return clickClose;
	}

	@FindBy(xpath = "(//div[@class='tk-cd-right-btn tsk_crd-sta_edt'])[1]")
	private WebElement clickStatusEdit;

	public WebElement getclickStatusEdit() {
		return clickStatusEdit;
	}

	@FindBy(xpath = "(//input[@id='tsk_stat-inp_nm'])[1]")
	private WebElement EnterStausName;

	public WebElement getEnterStausName() {
		return EnterStausName;
	}

	@FindBy(xpath = "(//select[@id='tsk_stat-inp_sts'])[1]")
	private WebElement ClickStatus;

	public WebElement getClickStatus() {
		return ClickStatus;
	}

	@FindBy(xpath = "(//option[@id='tsk_stat-opt_prg'])[1]")
	private WebElement SelectInProgress;

	public WebElement getSelectInProgress() {
		return SelectInProgress;
	}

	@FindBy(xpath = "//select[@id='select_cat']")
	private WebElement ClickCategory;

	public WebElement getClickCategory() {
		return ClickCategory;
	}

	@FindBy(xpath = "(//select[@id='select_cat'])[1]")
	private WebElement SelectFever;

	public WebElement getSelectFever() {
		return SelectFever;
	}

	@FindBy(xpath = "(//button[@id='tsk_sta-btn_nsts'])[1]")
	private WebElement ClickNewsStatses;

	public WebElement getClickNewsStatses() {
		return ClickNewsStatses;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='ad-tk-iccl-icon'])[1]")
	private WebElement ClickClose;

	public WebElement getClickClose() {
		return ClickClose;
	}

	@FindBy(xpath = "//button[contains(text(),'Task Template')]")
	private WebElement ClickEditTaskTemplate;

	public WebElement getClickEditTaskTemplate() {
		return ClickEditTaskTemplate;
	}

	@FindBy(xpath = "//button[normalize-space()='Create New Template']")
	private WebElement ClickCreateNewTemplate;

	public WebElement getClickCreateNewTemplate() {
		return ClickCreateNewTemplate;
	}

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement EnterTitle;

	public WebElement getEnterTitle() {
		return EnterTitle;
	}

	@FindBy(xpath = "(//select)[5]")
	private WebElement CickAssignee;

	public WebElement getCickAssignee() {
		return CickAssignee;
	}

	@FindBy(xpath = "(//select[@class='arrow-adj form-control'])[1]")
	private WebElement selectTech1Test;

	public WebElement getselectTech1Test() {
		return selectTech1Test;
	}

	@FindBy(xpath = "(//input[@id='tsk_crtTmp-inp_Nm'])[1]")
	private WebElement EnterTemplateName;

	public WebElement getEnterTemplateName() {
		return EnterTemplateName;
	}

	@FindBy(xpath = "(//input[@id='tsk_cr-inp_day'])[1]")
	private WebElement EnterDay;

	public WebElement getEnterDay() {
		return EnterDay;
	}

	@FindBy(xpath = "(//input[@id='tsk_cr-inp_hrs'])[1]")
	private WebElement EnterHour;

	public WebElement getEnterHour() {
		return EnterHour;
	}

	@FindBy(xpath = "(//input[@id='tsk_cr-inp_min'])[1]")
	private WebElement EnterMin;

	public WebElement getEnterMin() {
		return EnterMin;
	}

	@FindBy(xpath = "(//select)[6]")
	private WebElement Selectcategory;

	public WebElement getSelectcategory() {
		return Selectcategory;
	}

	@FindBy(xpath = "//option[normalize-space()='capminds']")
	private WebElement SelectCapminds;

	public WebElement getSelectCapminds() {
		return SelectCapminds;
	}

	@FindBy(xpath = "(//select[@name='priority'])[1]")
	private WebElement ClickPriority;

	public WebElement getClickPriority() {
		return ClickPriority;
	}

	@FindBy(xpath = "(//select)[8]")
	private WebElement Selectmedium;

	public WebElement getSelectmedium() {
		return Selectmedium;
	}

	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[7]/div[2]/select[1]")
	private WebElement ClickStatus1;

	public WebElement getClickStatus1() {
		return ClickStatus1;
	}

	@FindBy(xpath = "//option[contains(text(),'Arrived')]")
	private WebElement SelectArrived;

	public WebElement getSelectArrived() {
		return SelectArrived;
	}

	@FindBy(xpath = "(//textarea[@class='tk-temp-not form-control'])[1]")
	private WebElement EnterNotes;

	public WebElement getEnterNotes() {
		return EnterNotes;
	}

	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement SelectSave;

	public WebElement getSelectSave() {
		return SelectSave;
	}

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement SelectCancel;

	public WebElement getSelectCancel() {
		return SelectCancel;
	}

	@FindBy(xpath = "(//button[@class='bck-btn btn btn-primary'])[1]")
	private WebElement ClickBack;

	public WebElement getClickBack() {
		return ClickBack;
	}
////////////////TASK  FILTERS  ///////////////

	@FindBy(xpath = "(//select[@id='tsk_mng-sel_asne'])[1]")

	private WebElement Taskcli;

	public WebElement getTaskcli() {
		return Taskcli;
	}

	@FindBy(xpath = "(//select[@id='tsk_mng-sel_asne'])[1]")

	private WebElement seleassign;

	public WebElement getseleassign() {

		return seleassign;
	}

	@FindBy(xpath = "(//select[@id='tsk_mng-sel_prio'])[1]")

	private WebElement seleprio;

	public WebElement getseleprio() {

		return seleprio;
	}

	@FindBy(xpath = "(//select[@id='tsk_mng-sel_dueDt'])[1]")

	private WebElement duedate;

	public WebElement getduedate() {

		return duedate;
	}

	@FindBy(xpath = "(//button[@id='tsk_mng-btn_arc'])[1]")

	private WebElement archi;

	public WebElement getarchi() {

		return archi;
	}

	@FindBy(xpath = "(//button[@id='tsk_mng-btn_filt'])[1]")

	private WebElement resfil;

	public WebElement getresfil() {

		return resfil;
	}

	@FindBy(xpath = "(//select[@class='tk-frmc-wid arrow-adj form-control'])[1]")

	private WebElement seletask;

	public WebElement getseletask() {

		return seletask;
	}

////////////////ADD NEW TASK  ///////////////

	@FindBy(xpath = "(//button[@id='tsk_mng-btn_nwTsk'])[1]")

	private WebElement addnewtas;

	public WebElement getaddnewtas() {

		return addnewtas;
	}

	@FindBy(xpath = "(//select[@id='tsk_ad-sel_slTmp'])[1]")

	private WebElement seletem;

	public WebElement getseletem() {

		return seletem;
	}

	@FindBy(xpath = "(//select[@id='tsk_ad-sel_slCat'])[1]")

	private WebElement catsele;

	public WebElement getcatsele() {

		return catsele;
	}

	@FindBy(xpath = "(//select[@id='tsk_ad-sel_slSts'])[1]")

	private WebElement statse;

	public WebElement getstatse() {

		return statse;
	}

	@FindBy(xpath = "(//select[@class='form-control'])[5]")

	private WebElement cate;

	public WebElement getcate() {

		return cate;
	}

	@FindBy(xpath = "(//select[@class='form-control'])[6]")

	private WebElement stat;

	public WebElement getstat() {

		return stat;
	}

	@FindBy(xpath = "(//select[@id='tsk_ad-sel_asoSl'])[1]")

	private WebElement addass;

	public WebElement getaddass() {

		return addass;
	}
	@FindBy(xpath = "//*[@id='tsk_ad-inp_slDrp']/div[1]")

	private WebElement patna1;

	public WebElement getpatna1() {

		return patna1;
	}

	@FindBy(xpath = "//*[@id='tsk_ad-inp_slDrp']/div[1]")

	private WebElement patna;

	public WebElement getpatna() {

		return patna;
	}

	@FindBy(xpath = "(//span[@class='text'])[1]")

	private WebElement selepat;

	public WebElement getselepat() {

		return selepat;
	}

	@FindBy(xpath = "(//button[@id='tsk_ad-btn_sve'])[1]")

	private WebElement clisav;

	public WebElement getclisav() {

		return clisav;
	}
	@FindBy(xpath = "(//button[normalize-space()='View All Tasks'])[1]")

	private WebElement selectviewall;

	public WebElement getselectviewall() {

		return selectviewall;
	}
	
	@FindBy(xpath = "(//div[@class='vw-tk-back'][normalize-space()='Back'])[1]")

	private WebElement selectback;

	public WebElement getselectback() {

		return selectback;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[9]//*[name()='svg']")

	private WebElement clied;

	public WebElement getclied() {

		return clied;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement cliclo;

	public WebElement getcliclo() {

		return cliclo;
	}

}
