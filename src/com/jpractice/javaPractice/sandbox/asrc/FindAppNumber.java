package com.jpractice.javaPractice.sandbox.asrc;

public class FindAppNumber {

  public static void main(String[] args) {
    String message = "Application created with TSP-1234 app number.";
    String appNum = findAppNum(message);
    System.out.println("AppNum is: " + appNum);
  }

  public static String findAppNum(String message){
    String[] str = message.split(" ");
    String appNum = "";
    for ( String word : str){
      if ( word.startsWith("TSP")){
        appNum = word;
        break;
      }
      System.out.println("The word is: " + word);
    }
    return appNum;
  }

}
/*
Step Definitions for extracting appNumber:

@Step({"Extract appId from <messageLocator> and click on Go"})
  public void selectAppIdFromMessageAndGo(String messageLocator) {
    String message = seleniumUtils.getNRCSWebElement(tspApplicationB.returnNRCSRegistryTSPApplControlBy(messageLocator)).getText();
    String appID = tspApplicationB.findAppNum(message);
    logger.info("Application ID value: " + appID);
    try{
      Driver.wait.until(ExpectedConditions.elementToBeClickable(new By.ByCssSelector(("button[title*='Click Go button to Open "+appID+"']")))).click();
    }catch (ElementClickInterceptedException | TimeoutException e){
      Driver.wait.until(ExpectedConditions.elementToBeClickable(new By.ByCssSelector(("button[title*='Click Go button to Open "+appID+"']")))).click();
    }
  }
 */

/*
Step definition for retrieving the stored appNum value:

@Step({"Select the row that contains the stored <tspAppId> data and click to continue"})
  public void selectGoWithRelatedAppId(String tspAppId) {
    String appID = dsUtils.retrieveValue(tspAppId).toString();
    logger.info("Application ID value: " + appID);
    try{
      Driver.wait.until(ExpectedConditions.elementToBeClickable(new By.ByCssSelector(("button[title*='Click Go button to Open "+appID+"']")))).click();
    }catch (ElementClickInterceptedException | TimeoutException e){
      Driver.wait.until(ExpectedConditions.elementToBeClickable(new By.ByCssSelector(("button[title*='Click Go button to Open "+appID+"']")))).click();
    }
  }
 */
