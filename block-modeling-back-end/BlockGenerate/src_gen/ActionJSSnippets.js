/*
This file contains all the JS code snippets required to add a
new block to the TekTrain app.
*/


/***********************************************************/
/*---------- The JS code snippets for app.js file ---------*/
/***********************************************************/
case 'action':
    return {
    };




/***********************************************************/
/*------- The JS code snippets for appBlock.js file -------*/
/***********************************************************/
/** Import */
import Action from "./blockComponents/generated/Action";

/** render snippet */
  case "action":
    blockComponents = (
      <Action
        ref={ref}
        blockErrors={blockErrors}
        blockWarnings={blockWarnings}
        appHasChanged={this.appHasChanged}
      />
    );
    styleClassName = "action";
    break;



/***********************************************************/
/*------- The JS code snippets for toolbar.js file --------*/
/***********************************************************/
<ToolbarBlock
    key="toolbarAction"
    name="Action"
    type="action"
    isDragModeOn={isDragModeOn}
    x="0"
    y="0"
    handleDragMode={this.handleDragMode}
    newBlockHandler={this.newBlockHandler}
	category="detection"
/>



/***********************************************************/
/*----- The JS code snippets for toolbarBlock.js file -----*/
/***********************************************************/
   case 'action':
        styleClassName = 'action';
		 
		if((i18n.language == 'en') || (i18n.language == 'en-US')) {
			text = 'Testing Action Block';
		}
		else {
			text = 'Δοκιμαστικό Μπλοκ Δράσης';
		}

		if((i18n.language == 'en') || (i18n.language == 'en-US')) {
			tooltipText = '123';
		}
		else {
			tooltipText = '123';
		}
        break;
