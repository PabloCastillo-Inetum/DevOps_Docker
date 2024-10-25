package web.TestSuites;

import utilities.Utils.DriverUtils;
import utilities.Utils.MainUtils;
import utilities.Utils.WebUtilities;
import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Set;

public class TESTWEB {
  // Instanciar acciones/condiciones
  public static String testId;
  private static TESTWEB testweb_instance = null;
  private static String mainWindowHandle;

  // Instanciar clases de test con patrón Singleton
  public static TESTWEB setInstance() {
    if (testweb_instance == null) {
      testweb_instance = new TESTWEB();
    }
    return testweb_instance;
  }

  @BeforeClass(alwaysRun = true)
  public void executionSetup() throws Exception {
    MainUtils.testSuiteGeneration(this.getClass().getName().substring(15));
  }

  @BeforeMethod
  public void setup_test() throws Exception {
    testId = "TESTWEB";
    DriverUtils.instanciador_Chrome();
    MainUtils.setConditionsTrigger(true); // Se pone a true para evitar ejecución de condiciones
  }

  @AfterMethod
  public void breakup_test() throws Exception {
    DriverUtils.closeBrowser();
  }

  @AfterSuite
  public static void testSuiteEnd() throws Exception {
    MainUtils.testSuiteEnd();
  }

  /**************************************************
   * 
   * Precondiciones
   * 
   **************************************************/

  /**************************************************
   *
   * TESTWEB_TC001 - El objetivo consiste en acceder a la web de inetum
   * 
   * @throws IOException
   * 
   **************************************************/

  public void TESTWEB_TC001() throws Exception {
    /*****************************************/
    /* Métodos precondiciones */
    /*****************************************/

    if (MainUtils.getConditionsTrigger()) {
      MainUtils.testInicialization("TESTWEB_TC001");
    }

    testId = MainUtils.testId;
    MainUtils.printReportMessage("-----------------------------------");
    MainUtils.printReportMessage("[FRAMEWORK] Comienzo de Test Case: " + testId);
    /*****************************************/
    /* Métodos de la prueba */
    /*****************************************/
    TESTWEB_TC001_step01();
  }

  /**************************************************
   * 
   * TESTWEB_TC002 - El objetivo consiste en acceder al menú Elements
   * 
   * @throws IOException
   * 
   **************************************************/

  public void TESTWEB_TC002() throws Exception {
    /*****************************************/
    /* Métodos precondiciones */
    /*****************************************/
    if (MainUtils.getConditionsTrigger()) {
      MainUtils.testInicialization("TESTWEB_TC002");

      MainUtils.setConditionsTrigger(false);
      MainUtils.startPrecondition("TESTWEB_TC001");
      TESTWEB_TC001();
      MainUtils.endPrecondition("TESTWEB_TC001");
      MainUtils.setConditionsTrigger(true);
    } else {
      MainUtils.startPrecondition("TESTWEB_TC001");
      TESTWEB_TC001();
      MainUtils.endPrecondition("TESTWEB_TC001");
    }

    testId = MainUtils.testId;
    MainUtils.printReportMessage("-----------------------------------");
    MainUtils.printReportMessage("[FRAMEWORK] Comienzo de Test Case: " + testId);
    /*****************************************/
    /* Métodos de la prueba */
    /*****************************************/
    TESTWEB_TC002_step01();

  }

  /**************************************************
   * 
   * Pasos Precondiciones
   * 
   **************************************************/

  /**************************************************
   * 
   * PASOS TESTWEB_TC001
   * 
   **************************************************/

  public static void TESTWEB_TC001_step01() {

    MainUtils.newStep(1, "Abrir la página web demoqa.com",
        "Comprobar que aparecen los menús de 'Elements', 'Forms', 'Alerts, Frame & Windows', 'Widgets', 'Interactions' y 'Book Store Application'");

    /* Acciones -> */
    WebUtilities.navigateToURL("https://demoqa.com/");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.home_Elements");
    WebUtilities.webIsObjectDisplayed("TESTWEB.home_Forms");
    WebUtilities.webIsObjectDisplayed("TESTWEB.home_AlertsFrameWindosw");
    WebUtilities.webIsObjectDisplayed("TESTWEB.home_Widgets");
    WebUtilities.webIsObjectDisplayed("TESTWEB.home_Interactions");
    WebUtilities.webIsObjectDisplayed("TESTWEB.home_BookStore");

  }

  /**************************************************
   * 
   * PASOS TESTWEB_TC002
   * 
   **************************************************/

  public static void TESTWEB_TC002_step01() {
    /* Acciones -> */

    MainUtils.newStep(1, "Hacer click en el menú Elements",
        "Comprobar que aparecen los menús de \"Text Box\" y \"Buttons\"");
    WebUtilities.webClick("TESTWEB.home_Elements");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.elements_TextBox");
    WebUtilities.webIsObjectDisplayed("TESTWEB.elements_Buttons");

  }

  /**************************************************
   * 
   * Pruebas
   * 
   **************************************************/

  /**************************************************
   * 
   * TESTWEB_TC003 - El objetivo consiste acceder al menú Text Box, rellenar el
   * formulario y enviarlo
   * 
   * @throws IOException
   * 
   **************************************************/

  @Test(description = "TESTWEB_TC003 - Acceso a Text Box", enabled = true)
  public void TESTWEB_TC003() throws Exception {
    /*****************************************/
    /* Métodos precondiciones */
    /*****************************************/
    if (MainUtils.getConditionsTrigger()) {
      MainUtils.testInicialization("TESTWEB_TC003", "Acceso a Text Box");

      MainUtils.setConditionsTrigger(false);
      MainUtils.startPrecondition("TESTWEB_TC002");
      TESTWEB_TC002();
      MainUtils.endPrecondition("TESTWEB_TC002");
      MainUtils.setConditionsTrigger(true);
    } else {
      MainUtils.startPrecondition("TESTWEB_TC002");
      TESTWEB_TC002();
      MainUtils.endPrecondition("TESTWEB_TC002");
    }

    testId = MainUtils.testId;
    MainUtils.printReportMessage("-----------------------------------");
    MainUtils.printReportMessage("[FRAMEWORK] Comienzo de Test Case: " + testId);
    /*****************************************/
    /* Métodos de la prueba */
    /*****************************************/
    TESTWEB_TC003_step01();
    TESTWEB_TC003_step02();
  }

  /**************************************************
   * 
   * TESTWEB_TC004 - El objetivo consiste acceder al menú Buttons y hacer los tres
   * tipos de click
   * 
   * @throws IOException
   * 
   **************************************************/
  @Test(description = "TESTWEB_TC004 - Acceso a Buttons", enabled = true)
  public void TESTWEB_TC004() throws Exception {
    /*****************************************/
    /* Métodos precondiciones */
    /*****************************************/
    if (MainUtils.getConditionsTrigger()) {
      MainUtils.testInicialization("TESTWEB_TC004", "Acceso a Buttons");

      MainUtils.setConditionsTrigger(false);
      MainUtils.startPrecondition("TESTWEB_TC002");
      TESTWEB_TC002();
      MainUtils.endPrecondition("TESTWEB_TC002");
      MainUtils.setConditionsTrigger(true);
    } else {
      MainUtils.startPrecondition("TESTWEB_TC002");
      TESTWEB_TC002();
      MainUtils.endPrecondition("TESTWEB_TC002");
    }

    testId = MainUtils.testId;
    MainUtils.printReportMessage("-----------------------------------");
    MainUtils.printReportMessage("[FRAMEWORK] Comienzo de Test Case: " + testId);
    /*****************************************/
    /* Métodos de la prueba */
    /*****************************************/
    TESTWEB_TC004_step01();
    TESTWEB_TC004_step02();
    TESTWEB_TC004_step03();
    TESTWEB_TC004_step04();
  }

  /**************************************************
   * 
   * TESTWEB_TC005 - El objetivo consiste en acceder al menú Alerts, Frame &
   * Windows
   * 
   * @throws IOException
   * 
   **************************************************/

  public void TESTWEB_TC005() throws Exception {
    /*****************************************/
    /* Métodos precondiciones */
    /*****************************************/
    if (MainUtils.getConditionsTrigger()) {
      MainUtils.testInicialization("TESTWEB_TC005");

      MainUtils.setConditionsTrigger(false);
      MainUtils.startPrecondition("TESTWEB_TC001");
      TESTWEB_TC001();
      MainUtils.endPrecondition("TESTWEB_TC001");
      MainUtils.setConditionsTrigger(true);
    } else {
      MainUtils.startPrecondition("TESTWEB_TC001");
      TESTWEB_TC001();
      MainUtils.endPrecondition("TESTWEB_TC001");
    }

    testId = MainUtils.testId;
    MainUtils.printReportMessage("-----------------------------------");
    MainUtils.printReportMessage("[FRAMEWORK] Comienzo de Test Case: " + testId);
    /*****************************************/
    /* Métodos de la prueba */
    /*****************************************/
    TESTWEB_TC005_step01();

  }

  /**************************************************
   * 
   * TESTWEB_TC006 - El objetivo consiste en acceder al menú Browser Windows,
   * abrir una nueva ventana e identificar objetos en ella
   * 
   * @throws IOException
   * 
   **************************************************/

  @Test(description = "TESTWEB_TC006 - Acceso a Browser Windows", enabled = true)
  public void TESTWEB_TC006() throws Exception {
    /*****************************************/
    /* Métodos precondiciones */
    /*****************************************/
    if (MainUtils.getConditionsTrigger()) {
      MainUtils.testInicialization("TESTWEB_TC006", "Acceso a Browser Windows");

      MainUtils.setConditionsTrigger(false);
      MainUtils.startPrecondition("TESTWEB_TC005");
      TESTWEB_TC005();
      MainUtils.endPrecondition("TESTWEB_TC005");
      MainUtils.setConditionsTrigger(true);
    } else {
      MainUtils.startPrecondition("TESTWEB_TC005");
      TESTWEB_TC005();
      MainUtils.endPrecondition("TESTWEB_TC005");
    }

    testId = MainUtils.testId;
    MainUtils.printReportMessage("-----------------------------------");
    MainUtils.printReportMessage("[FRAMEWORK] Comienzo de Test Case: " + testId);
    /*****************************************/
    /* Métodos de la prueba */
    /*****************************************/
    TESTWEB_TC006_step01();
    TESTWEB_TC006_step02();
    TESTWEB_TC006_step03();

  }

  /**************************************************
   * 
   * TESTWEB_TC007 - El objetivo consiste en acceder al menú Frames e identificar
   * objetos dentro de un Iframe
   * 
   * @throws IOException
   * 
   **************************************************/

  @Test(description = "TESTWEB_TC007 - Acceso a Frame", enabled = true)
  public void TESTWEB_TC007() throws Exception {
    /*****************************************/
    /* Métodos precondiciones */
    /*****************************************/
    if (MainUtils.getConditionsTrigger()) {
      MainUtils.testInicialization("TESTWEB_TC007", "Acceso a Frame");

      MainUtils.setConditionsTrigger(false);
      MainUtils.startPrecondition("TESTWEB_TC005");
      TESTWEB_TC005();
      MainUtils.endPrecondition("TESTWEB_TC005");
      MainUtils.setConditionsTrigger(true);
    } else {
      MainUtils.startPrecondition("TESTWEB_TC005");
      TESTWEB_TC005();
      MainUtils.endPrecondition("TESTWEB_TC005");
    }

    testId = MainUtils.testId;
    MainUtils.printReportMessage("-----------------------------------");
    MainUtils.printReportMessage("[FRAMEWORK] Comienzo de Test Case: " + testId);
    /*****************************************/
    /* Métodos de la prueba */
    /*****************************************/
    TESTWEB_TC007_step01();
    TESTWEB_TC007_step02();
    TESTWEB_TC007_step03();
    TESTWEB_TC007_step04();
  }

  /**************************************************
   * 
   * TESTWEB_TC003 - El objetivo consiste acceder al menú Text Box, rellenar el
   * formulario y enviarlo
   * 
   * @throws IOException
   * 
   **************************************************/

  @Test(description = "TESTWEB_TC008 - Test Failed", enabled = true)
  public void TESTWEB_TC008() throws Exception {
    /*****************************************/
    /* Métodos precondiciones */
    /*****************************************/
    if (MainUtils.getConditionsTrigger()) {
      MainUtils.testInicialization("TESTWEB_TC008",
          "Ejecución de Test de Ejemplo que debe dar FAILED (Para ello, se ha utilizado un XPATH incorrecto), al intentar realizar la acción no será capaz y fallará el TEST");

      MainUtils.setConditionsTrigger(false);
      MainUtils.startPrecondition("TESTWEB_TC002");
      TESTWEB_TC002();
      MainUtils.endPrecondition("TESTWEB_TC002");
      MainUtils.setConditionsTrigger(true);
    } else {
      MainUtils.startPrecondition("TESTWEB_TC002");
      TESTWEB_TC002();
      MainUtils.endPrecondition("TESTWEB_TC002");
    }

    testId = MainUtils.testId;
    MainUtils.printReportMessage("-----------------------------------");
    MainUtils.printReportMessage("[FRAMEWORK] Comienzo de Test Case: " + testId);
    /*****************************************/
    /* Métodos de la prueba */
    /*****************************************/
    TESTWEB_TC008_step01();
    TESTWEB_TC008_step02();
  }

  /**************************************************
   * 
   * TESTWEB_TC003 - El objetivo consiste acceder al menú Text Box, rellenar el
   * formulario y enviarlo
   * 
   * @throws IOException
   * 
   **************************************************/

  @Test(description = "TESTWEB_TC009 - Test Passed with failures", enabled = true)
  public void TESTWEB_TC009() throws Exception {
    /*****************************************/
    /* Métodos precondiciones */
    /*****************************************/
    if (MainUtils.getConditionsTrigger()) {
      MainUtils.testInicialization("TESTWEB_TC009",
          "Ejecución de Test de Ejemplo que debe dar PASSED WITH FAILURES (Para ello, se ha utilizado un XPATH incorrecto), al intentar realizar la condición no será capaz y fallará el TEST");

      MainUtils.setConditionsTrigger(false);
      MainUtils.startPrecondition("TESTWEB_TC002");
      TESTWEB_TC002();
      MainUtils.endPrecondition("TESTWEB_TC002");
      MainUtils.setConditionsTrigger(true);
    } else {
      MainUtils.startPrecondition("TESTWEB_TC002");
      TESTWEB_TC002();
      MainUtils.endPrecondition("TESTWEB_TC002");
    }

    testId = MainUtils.testId;
    MainUtils.printReportMessage("-----------------------------------");
    MainUtils.printReportMessage("[FRAMEWORK] Comienzo de Test Case: " + testId);
    /*****************************************/
    /* Métodos de la prueba */
    /*****************************************/
    TESTWEB_TC009_step01();
    TESTWEB_TC009_step02();
  }

  /**************************************************
   * 
   * PASOS TESTWEB
   * 
   **************************************************/
  /**************************************************
   * 
   * PASOS TESTWEB_TC003
   * 
   **************************************************/

  public static void TESTWEB_TC003_step01() {
    MainUtils.newStep(1, "Acceder al menu Text Box",
        "Comprobar que aparece el formulario con los campos Full Name, Email, Current Address, Permanent Address y el boton Submit");

    /* Acciones -> */
    WebUtilities.webClick("TESTWEB.elements_TextBox");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_FullName");
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_Email");
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_currentAddress");
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_permanentAddress");
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_submit");

  }

  public static void TESTWEB_TC003_step02() throws Exception {
    MainUtils.newStep(2, "Rellenar el formulario y enviar",
        "Comprobar que aparece debajo del formulario el formulario relleno con los datos insertados");
    /* Acciones -> */
    WebUtilities.webClick("TESTWEB.textBox_FullName");
    WebUtilities.webSendkeysRepository("TESTWEB.textBox_FullName", "FullName");
    WebUtilities.webClick("TESTWEB.textBox_Email");
    WebUtilities.webSendkeysRepository("TESTWEB.textBox_Email", "Email");
    WebUtilities.webClick("TESTWEB.textBox_currentAddress");
    WebUtilities.webSendkeysRepository("TESTWEB.textBox_currentAddress", "CurrentAddress");
    WebUtilities.webClick("TESTWEB.textBox_permanentAddress");
    WebUtilities.webSendkeysRepository("TESTWEB.textBox_permanentAddress", "PermanentAddress");
    WebUtilities.webClick("TESTWEB.textBox_submit");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_FormSubmit");
    WebUtilities
        .webIsObjectDisplayedByXpath("//p[@id='name' and text()='" + MainUtils.obtainJSONData("FullName") + "']");
    WebUtilities.webIsObjectDisplayedByXpath("//p[@id='email' and text()='" + MainUtils.obtainJSONData("Email") + "']");
    WebUtilities.webIsObjectDisplayedByXpath(
        "//p[@id='currentAddress' and text()='" + MainUtils.obtainJSONData("CurrentAddress") + "']");
    WebUtilities.webIsObjectDisplayedByXpath(
        "//p[@id='permanentAddress' and text()='" + MainUtils.obtainJSONData("PermanentAddress") + "']");
  }

  /**************************************************
   * 
   * PASOS TESTWEB_TC004
   * 
   **************************************************/

  public static void TESTWEB_TC004_step01() {
    MainUtils.newStep(1, "Acceder al menu Buttons",
        "Comprobar que aparecen los botones Double Click Me, Right Click Me y Click Me");
    /* Acciones -> */
    WebUtilities.webClick("TESTWEB.buttons");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.buttons_DoubleClick");
    WebUtilities.webIsObjectDisplayed("TESTWEB.buttons_RightClick");
    WebUtilities.webIsObjectDisplayed("TESTWEB.buttons_Click");
  }

  public static void TESTWEB_TC004_step02() throws Exception {
    MainUtils.newStep(2, "Hacer doble click en el boton Double Click Me",
        "Comprobar que aparece debajo el mensaje 'You have done a double click'");
    /* Acciones -> */
    WebUtilities.webDoubleClick("TESTWEB.buttons_DoubleClick");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.buttons_DoubleClickMessage");
  }

  public static void TESTWEB_TC004_step03() throws Exception {
    MainUtils.newStep(3, "Hacer click derecho en el boton Right Click Me",
        "Comprobar que aparece debajo el mensaje \"You have done a right click\"");
    /* Acciones -> */
    WebUtilities.webClickRight("TESTWEB.buttons_RightClick");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.buttons_RightClickMessage");
  }

  public static void TESTWEB_TC004_step04() throws Exception {
    MainUtils.newStep(4, "Hacer click en el boton Click Me",
        "Comprobar que aparece debajo el mensaje \"You have done a dynamic click\"");
    /* Acciones -> */
    WebUtilities.webClick("TESTWEB.buttons_Click");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.buttons_ClickMessage");
  }

  public static void TESTWEB_TC005_step01() {
    MainUtils.newStep(1, "Hacer click en el manú Alerts, Frame & Windows",
        "Comprobar que aparecen los menús de \"Browser Windows\" y \"Frames\"");
    /* Acciones -> */
    WebUtilities.webClick("TESTWEB.home_AlertsFrameWindosw");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.Frame_Windows");
    WebUtilities.webIsObjectDisplayed("TESTWEB.Frame_Frames");

  }

  /**************************************************
   * 
   * PASOS TESTWEB_TC006
   * 
   **************************************************/

  public static void TESTWEB_TC006_step01() {
    MainUtils.newStep(1, "Hacer click en el manú Browser Windows", "Comprobar que aparecen el boton New Window");
    /* Acciones -> */
    WebUtilities.webClick("TESTWEB.Frame_Windows");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.Windows_newWindows");

  }

  public static void TESTWEB_TC006_step02() {
    MainUtils.newStep(2, "Abrir una nueva ventana e identificar el encabezado que aparece en la misma",
        "Comprobar que aparece el encabezado con el texto \"This is a sample page\"");
    /* Acciones -> */
    mainWindowHandle = DriverUtils.getDriver().getWindowHandle();
    WebUtilities.webClick("TESTWEB.Windows_newWindows");
    // Cambiar a la nueva ventana
    Set<String> windowHandles = DriverUtils.getDriver().getWindowHandles();
    for (String windowHandle : windowHandles) {
      if (!windowHandle.equals(mainWindowHandle)) {
        DriverUtils.getDriver().switchTo().window(windowHandle);
        break;
      }
    }

    /* Condiciones -> */
    MainUtils.forceWait(Duration.ofSeconds(1));
    WebUtilities.webIsObjectDisplayed("TESTWEB.Windows_newWindowsHeader");
  }

  public static void TESTWEB_TC006_step03() {
    MainUtils.newStep(3, "Cerrar la ventana secundaria y volver a la principal",
        "Comprobar que aparece el encabezado \"Browser Windows\"");
    /* Acciones -> */
    DriverUtils.getDriver().close();
    DriverUtils.getDriver().switchTo().window(mainWindowHandle);

    /* Condiciones -> */
    MainUtils.forceWait(Duration.ofSeconds(1));
    WebUtilities.webIsObjectDisplayed("TESTWEB.Windows_headers");
  }

  /**************************************************
   * 
   * PASOS TESTWEB_TC007
   * 
   **************************************************/

  public static void TESTWEB_TC007_step01() {
    MainUtils.newStep(1, "Hacer click en el menú Frame", "Comprobar que aparecen dos Iframe");
    /* Acciones -> */
    WebUtilities.webClick("TESTWEB.Frame_Frames");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.Frames_Iframe1");
    WebUtilities.webIsObjectDisplayed("TESTWEB.Frames_Iframe2");

  }

  public static void TESTWEB_TC007_step02() {
    MainUtils.newStep(2, "Cambiar de contexto al iframe1",
        "Comprobar que aparece el elemento h1 \"This is a sample page\"");
    /* Acciones -> */
    DriverUtils.getDriver().switchTo().frame("frame1");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.Iframe_header");
  }

  public static void TESTWEB_TC007_step03() {
    MainUtils.newStep(3, "Cambiar de contexto al iframe2",
        "Comprobar que aparece el elemento h1 \"This is a sample page\"");
    /* Acciones -> */
    DriverUtils.getDriver().switchTo().defaultContent();
    DriverUtils.getDriver().switchTo().frame("frame2");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.Iframe_header");
  }

  public static void TESTWEB_TC007_step04() {
    MainUtils.newStep(4, "Cambiar de contexto a la ventana por defecto e identificamos el h1 \"Frames\"",
        "Comprobar que aparece el elemento h1 \"This is a sample page\"");
    /* Acciones -> */
    DriverUtils.getDriver().switchTo().defaultContent();

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.Frames_h1");
  }

  /**************************************************
   * 
   * PASOS TESTWEB_TC008
   * 
   **************************************************/

  public static void TESTWEB_TC008_step01() {
    MainUtils.newStep(1, "Acceder al menu Text Box",
        "Comprobar que aparece el formulario con los campos Full Name, Email, Current Address, Permanent Address y el boton Submit");
    /* Acciones -> */
    WebUtilities.webClick("TESTWEB.elements_TextBox");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_FullName");
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_Email");
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_currentAddress");
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_permanentAddress");
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_submit");
  }

  public static void TESTWEB_TC008_step02() throws Exception {
    MainUtils.newStep(2, "Rellenar el formulario de manera incorrecta", "El test debe dar failed");
    /* Acciones -> */
    WebUtilities.webClick("TESTWEB.textBox_FullNameWrong");
    WebUtilities.webSendkeysRepository("TESTWEB.textBox_FullName", "FullName");
    WebUtilities.webClick("TESTWEB.textBox_Email");
    WebUtilities.webSendkeysRepository("TESTWEB.textBox_Email", "Email");
    WebUtilities.webClick("TESTWEB.textBox_currentAddress");
    WebUtilities.webSendkeysRepository("TESTWEB.textBox_currentAddress", "CurrentAddress");
    WebUtilities.webClick("TESTWEB.textBox_permanentAddress");
    WebUtilities.webSendkeysRepository("TESTWEB.textBox_permanentAddress", "PermanentAddress");
    WebUtilities.webClick("TESTWEB.textBox_submit");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_FormSubmit");
    WebUtilities
        .webIsObjectDisplayedByXpath("//p[@id='name' and text()='" + MainUtils.obtainJSONData("FullName") + "']");
    WebUtilities.webIsObjectDisplayedByXpath("//p[@id='email' and text()='" + MainUtils.obtainJSONData("Email") + "']");
    WebUtilities.webIsObjectDisplayedByXpath(
        "//p[@id='currentAddress' and text()='" + MainUtils.obtainJSONData("CurrentAddress") + "']");
    WebUtilities.webIsObjectDisplayedByXpath(
        "//p[@id='permanentAddress' and text()='" + MainUtils.obtainJSONData("PermanentAddress") + "']");
  }

  /**************************************************
   * 
   * PASOS TESTWEB_TC009
   * 
   **************************************************/

  public static void TESTWEB_TC009_step01() {
    MainUtils.newStep(1, "Acceder al menu Text Box pero comprobar mal el campo email",
        "El test debe dar passed with failures");
    /* Acciones -> */
    WebUtilities.webClick("TESTWEB.elements_TextBox");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_FullName");
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_EmailWrong");
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_currentAddress");
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_permanentAddress");
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_submit");
  }

  public static void TESTWEB_TC009_step02() throws Exception {
    MainUtils.newStep(2, "Rellenar el formulario", "El test debe dar passed with failures");
    /* Acciones -> */
    WebUtilities.webClick("TESTWEB.textBox_FullName");
    WebUtilities.webSendkeysRepository("TESTWEB.textBox_FullName", "FullName");
    WebUtilities.webClick("TESTWEB.textBox_Email");
    WebUtilities.webSendkeysRepository("TESTWEB.textBox_Email", "Email");
    WebUtilities.webClick("TESTWEB.textBox_currentAddress");
    WebUtilities.webSendkeysRepository("TESTWEB.textBox_currentAddress", "CurrentAddress");
    WebUtilities.webClick("TESTWEB.textBox_permanentAddress");
    WebUtilities.webSendkeysRepository("TESTWEB.textBox_permanentAddress", "PermanentAddress");
    WebUtilities.webClick("TESTWEB.textBox_submit");

    /* Condiciones -> */
    WebUtilities.webIsObjectDisplayed("TESTWEB.textBox_FormSubmit");
    WebUtilities
        .webIsObjectDisplayedByXpath("//p[@id='name' and text()='" + MainUtils.obtainJSONData("FullName") + "']");
    WebUtilities.webIsObjectDisplayedByXpath("//p[@id='email' and text()='" + MainUtils.obtainJSONData("Email") + "']");
    WebUtilities.webIsObjectDisplayedByXpath(
        "//p[@id='currentAddress' and text()='" + MainUtils.obtainJSONData("CurrentAddress") + "']");
    WebUtilities.webIsObjectDisplayedByXpath(
        "//p[@id='permanentAddress' and text()='" + MainUtils.obtainJSONData("PermanentAddress") + "']");
  }

}
