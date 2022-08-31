package blockModeling.utils;

import blockModelingMetamodel.BlockModelingMetamodelFactory;
import blockModelingMetamodel.BlockApp;
import blockModelingMetamodel.ActionBlock;
import blockModelingMetamodel.ReferenceBlock;
import blockModelingMetamodel.DecisionBlock;
import blockModelingMetamodel.Information;
import blockModelingMetamodel.SelectInputBlock;
import blockModelingMetamodel.IntegerInputBlock;
import blockModelingMetamodel.FloatInputBlock;
import blockModelingMetamodel.TextInputBlock;
import blockModelingMetamodel.ConfigurationPopover;
import blockModelingMetamodel.SettingsPopover;
import blockModelingMetamodel.PhrasesInputForm;
import blockModelingMetamodel.LabeledTextInputForm;
import blockModelingMetamodel.LabeledFloatInputForm;
import blockModelingMetamodel.LabeledIntegerInputForm;
import blockModelingMetamodel.ParameterInputForm;
import blockModelingMetamodel.ConditionInputForm;
import blockModelingMetamodel.ConditionOption;
import blockModelingMetamodel.Option;
import blockModelingMetamodel.Cursor;
import blockModelingMetamodel.Category;
import blockModelingMetamodel.ComparisonType;
import blockModelingMetamodel.ImageBackgroundShape;


public class AppModelParser {
	
	private BlockModelingMetamodelFactory factory = BlockModelingMetamodelFactory.eINSTANCE;
	private BlockApp ecoreModel = factory.createBlockApp();
	
	public AppModelParser() {
			super();
		}
	
	
	// This method creates the ecore model that represents a Decision block
	public BlockApp createDecisionEcoreModel(blockModeling.Models.DecisionBlock block) {
		
		// Initialize the action block.
		DecisionBlock dBlock = this.factory.createDecisionBlock();
		// Set the block's Name, In Greek.
		dBlock.setBlockNameEL(block.getBlockNameEL());
		// Set the block's Name, In English.
		dBlock.setBlockNameEN(block.getBlockNameEN());
		// Set the block's Category.
		switch(block.getCategory()) {
			case "MOVE":
				dBlock.setCategory(Category.MOVEMENT);
				break;
			case "DETECTION":
				dBlock.setCategory(Category.DETECTION);
				break;
			case "SOUND":
				dBlock.setCategory(Category.SOUND);
				break;
			case "TOOLS":
				dBlock.setCategory(Category.TOOLS);
				break;
			case "VARIOUS":
				dBlock.setCategory(Category.VARIOUS);
				break;
			default:
				dBlock.setCategory(Category.MOVEMENT);
		}
		
		// Set the block's backgroundColor.
		dBlock.setBackroundColor(block.getBackroundColor());
		// Set the block's blockImage.
		dBlock.setBlockImage(block.getBlockImage());
		// Set the block's number of columns
		dBlock.setNumberOfColumns(block.getNumberOfColumns());
//		// Set the block's number of branches
//		dBlock.setNumberOfBranches(block.getNumberOfBranches());
		
		// Set the block's Cursor.		
		switch(block.getBlockImageCursor()) {
			case "help":
				dBlock.setBlockImageCursor(Cursor.HELP);
				break;
			case "pointer":
				dBlock.setBlockImageCursor(Cursor.POINTER);
				break;
			case "default":
				dBlock.setBlockImageCursor(Cursor.DEFAULT);
				break;
			default:
				dBlock.setBlockImageCursor(Cursor.DEFAULT);	
		}
		// parse the block's Configuration Popover
		if(block.getHasConfigurationPopover() != null) {
			dBlock.setHasConfigurationPopover(parseConfigurationPopover(block.getHasConfigurationPopover()));
		}
		
		if(block.getHasSettingsPopover() != null) {
			// parse the block's settings Popover.
			dBlock.setHasSettingsPopover(parseSettingsPopover(block.getHasSettingsPopover()));
		}
		
		// Set the BlockApp's block.
		ecoreModel.setHasBlock(dBlock);
		
		return ecoreModel;
		
	}
	
	// This method creates the ecore model that represents an action block
	public BlockApp createActionEcoreModel(blockModeling.Models.ActionBlock block) {
		
		// Initialize the action block
		ActionBlock aBlock = this.factory.createActionBlock();
		
		// Set the block's Name, In Greek.
		aBlock.setBlockNameEL(block.getBlockNameEL());
		// Set the block's Name, In English.
		aBlock.setBlockNameEN(block.getBlockNameEN());
		// Set the block's category.
		switch(block.getCategory()) {
			case "MOVE":
				aBlock.setCategory(Category.MOVEMENT);
				break;
			case "DETECTION":
				aBlock.setCategory(Category.DETECTION);
				break;
			case "SOUND":
				aBlock.setCategory(Category.SOUND);
				break;
			case "TOOLS":
				aBlock.setCategory(Category.TOOLS);
				break;
			case "VARIOUS":
				aBlock.setCategory(Category.VARIOUS);
				break;
			default:
				aBlock.setCategory(Category.MOVEMENT);
		}
		
		// Set the block's backgroundColor.
		aBlock.setBackroundColor(block.getBackroundColor());
		// Set the block's blockTitleEL.
		aBlock.setBlockTitleEL(block.getBlockTitleEL());
		// Set the block's blockTitleEN.
		aBlock.setBlockTitleEN(block.getBlockTitleEN());
		// Set the block's blockImage.
		aBlock.setBlockImage(block.getBlockImage());
		// Set the block's hasPopover.
		aBlock.setHasPopover(block.getHasPopover());
		
		if(block.getHasPopover()) {
			// Set the block's PopoverIcon
			aBlock.setPopoverIcon(block.getPopoverIcon());

			if(block.getPopoverHelpTextEL() != null) {
				// Set the block's PopoverHelpTextEL
				aBlock.setPopoverHelpTextEL(block.getPopoverHelpTextEL());
			}
			
			if(block.getPopoverHelpTextEN() != null) {
				// Set the block's PopoverHelpTextEN
				aBlock.setPopoverHelpTextEN(block.getPopoverHelpTextEN());
			}
		}
		
		if(block.getTitleBackroundColor() != null) {
			// set the Block's titleBackgroundColor.
			aBlock.setTitleBackroundColor(block.getTitleBackroundColor());
		}
		// Parse the block's Input Block's.
		if(block.getHasInput().size() > 0) {
			for(int i=0; i < block.getHasInput().size(); i++) {
				switch(block.getHasInput().get(i).getType()) {
					case "text-input-block":
						aBlock.getHasInput().add(parseTextInputBlock(block.getHasInput().get(i)));
						break;
					case "integer-input-block":
						aBlock.getHasInput().add(parseIntegerInputBlock(block.getHasInput().get(i)));
						break;
					case "float-input-block":
						aBlock.getHasInput().add(parseFloatInputBlock(block.getHasInput().get(i)));
						break;
					case "select-input-block":
						aBlock.getHasInput().add(parseSelectInputBlock(block.getHasInput().get(i)));
						break;
				}
			}			
		}
		
		// Parse the block's Information Block.
		aBlock.setHasInfo(parseInformation(block.getHasInfo()));
		if(block.getHasPopover()) {
			// parse the block's settings Popover.
			aBlock.setHasSettingsPopover(parseSettingsPopover(block.getHasSettingsPopover()));
		}
		// Set the BlockApp's block.
		ecoreModel.setHasBlock(aBlock);
		
		return ecoreModel;
		}
	
	// This method creates the ecore model that represents a reference block
	public BlockApp createReferenceEcoreModel(blockModeling.Models.ReferenceBlock block) {
		
		// Initialize the reference block
		ReferenceBlock rBlock = this.factory.createReferenceBlock();
		
		// Set the block's Name, In Greek.
		rBlock.setBlockNameEL(block.getBlockNameEL());
		// Set the block's Name, In English.
		rBlock.setBlockNameEN(block.getBlockNameEN());
		// Set the block's category.
		switch(block.getCategory()) {
			case "MOVE":
				rBlock.setCategory(Category.MOVEMENT);
				break;
			case "DETECTION":
				rBlock.setCategory(Category.DETECTION);
				break;
			case "SOUND":
				rBlock.setCategory(Category.SOUND);
				break;
			case "TOOLS":
				rBlock.setCategory(Category.TOOLS);
				break;
			case "VARIOUS":
				rBlock.setCategory(Category.VARIOUS);
				break;
			default:
				rBlock.setCategory(Category.MOVEMENT);
		}
		// Set the block's backgroundColor.
		rBlock.setBackroundColor(block.getBackroundColor());
		// Set the block's blockTitleEL.
		rBlock.setBlockTitleEL(block.getBlockTitleEL());
		// Set the block's blockTitleEN.
		rBlock.setBlockTitleEN(block.getBlockTitleEN());
		// Set the block's blockImage.
		rBlock.setBlockImage(block.getBlockImage());
		// Set the block's imageBackgroundShape.
		switch(block.getImageBackroundShape()) {
			case "circle":
				rBlock.setImageBackroundShape(ImageBackgroundShape.CIRCLE);
				break;
			case "square":
				rBlock.setImageBackroundShape(ImageBackgroundShape.SQUARE);
				break;
			case "hexagon":
				rBlock.setImageBackroundShape(ImageBackgroundShape.HEXAGON);
				break;
			case "octagon":
				rBlock.setImageBackroundShape(ImageBackgroundShape.OCTAGON);
				break;
			default:
				rBlock.setImageBackroundShape(ImageBackgroundShape.CIRCLE);
		}
		// Set the block's hasNextBlock.
		rBlock.setHasNextBlock(block.getHasNextBlock());
		// Set the block's Cursor.		
		switch(block.getImageCursor()) {
			case "help":
				rBlock.setImageCursor(Cursor.HELP);
				break;
			case "pointer":
				rBlock.setImageCursor(Cursor.POINTER);
				break;
			case "default":
				rBlock.setImageCursor(Cursor.DEFAULT);
				break;
			default:
				rBlock.setImageCursor(Cursor.DEFAULT);	
		}
		
		if(block.getImageBackroundShapeColor()!= null) {
			// Set the block's imageBackroundShapeColor.
			rBlock.setImageBackroundShapeColor(block.getImageBackroundShapeColor());
		}
		
		// Parse the block's Information Block.
		rBlock.setHasInfo(parseInformation(block.getHasInfo()));
		
		// Set the BlockApp's block.
		ecoreModel.setHasBlock(rBlock);
		
		return ecoreModel;
	}
	
	private Information parseInformation(blockModeling.Models.Information info) {
		
		// Initialize the information model.		
		Information hasInfo = this.factory.createInformation();
		
		// Set the block's InformationTextEL.
		hasInfo.setInformationTextEL(info.getInformationTextEL());
		// Set the block's InformationTextEN.
		hasInfo.setInformationTextEN(info.getInformationTextEN());
		
		// Set the block's Cursor.		
		switch(info.getCursor()) {
			case "help":
				hasInfo.setCursor(Cursor.HELP);
				break;
			case "pointer":
				hasInfo.setCursor(Cursor.POINTER);
				break;
			case "default":
				hasInfo.setCursor(Cursor.DEFAULT);
				break;
			default:
				hasInfo.setCursor(Cursor.DEFAULT);	
		}
		return hasInfo;
	}
	
	private TextInputBlock parseTextInputBlock(blockModeling.Models.InputBlock block) {
		
		// Initialize Text Input Block.
		TextInputBlock tBlock = this.factory.createTextInputBlock();
		
		// Set the block's Image.
		tBlock.setImage(block.getImage());
		// Set the block's infoTextEL.
		tBlock.setInfoTextEL(block.getInfoTextEL());
		// Set the block's infoTextEN.
		tBlock.setInfoTextEN(block.getInfoTextEN());
		// Set the block's variableName.
		tBlock.setVariableName(block.getVariableName());
		// Set the block's Cursor.		
		switch(block.getIconCursor()) {
			case "help":
				tBlock.setIconCursor(Cursor.HELP);
				break;
			case "pointer":
				tBlock.setIconCursor(Cursor.POINTER);
				break;
			case "default":
				tBlock.setIconCursor(Cursor.DEFAULT);
				break;
			default:
				tBlock.setIconCursor(Cursor.DEFAULT);	
		}
		// Set the block's defaultValueEL.
		tBlock.setDefaultValueEL(block.getDefaultValueEL());
		// Set the block's defaultValueEN.
		tBlock.setDefaultValueEN(block.getDefaultValueEN());
		
		return tBlock;
	}
	
	private IntegerInputBlock parseIntegerInputBlock(blockModeling.Models.InputBlock block) {
		
		// Initialize Integer Input Block.
		IntegerInputBlock iBlock = this.factory.createIntegerInputBlock();
		
		// Set the block's Image.
		iBlock.setImage(block.getImage());
		// Set the block's infoTextEL.
		iBlock.setInfoTextEL(block.getInfoTextEL());
		// Set the block's infoTextEN.
		iBlock.setInfoTextEN(block.getInfoTextEN());
		// Set the block's variableName.
		iBlock.setVariableName(block.getVariableName());
		// Set the block's Cursor.		
		switch(block.getIconCursor()) {
			case "help":
				iBlock.setIconCursor(Cursor.HELP);
				break;
			case "pointer":
				iBlock.setIconCursor(Cursor.POINTER);
				break;
			case "default":
				iBlock.setIconCursor(Cursor.DEFAULT);
				break;
			default:
				iBlock.setIconCursor(Cursor.DEFAULT);	
		}
		// Set the block's minValue.
		iBlock.setMinValue((int)block.getMinValue());
		// Set the block's maxValue.
		iBlock.setMaxValue((int)block.getMaxValue());
		// Set the block's defaultValue.
		iBlock.setDefaultValue((int)block.getDefaultValue());
		// Set the block's noMinValue
		iBlock.setNoMinValue(block.getNoMinValue());
		// Set the block's noMaxValue
		iBlock.setNoMaxValue(block.getNoMaxValue());
		// Set the block's noDefaultValue
		iBlock.setNoDefaultValue(block.getNoDefaultValue());

		return iBlock;
	}
	
	private FloatInputBlock parseFloatInputBlock(blockModeling.Models.InputBlock block) {
		
		// Initialize Float Input Block.
		FloatInputBlock fBlock = this.factory.createFloatInputBlock();
		
		// Set the block's Image.
		fBlock.setImage(block.getImage());
		// Set the block's infoTextEL.
		fBlock.setInfoTextEL(block.getInfoTextEL());
		// Set the block's infoTextEN.
		fBlock.setInfoTextEN(block.getInfoTextEN());
		// Set the block's variableName.
		fBlock.setVariableName(block.getVariableName());
		// Set the block's Cursor.		
		switch(block.getIconCursor()) {
			case "help":
				fBlock.setIconCursor(Cursor.HELP);
				break;
			case "pointer":
				fBlock.setIconCursor(Cursor.POINTER);
				break;
			case "default":
				fBlock.setIconCursor(Cursor.DEFAULT);
				break;
			default:
				fBlock.setIconCursor(Cursor.DEFAULT);	
		}
		// Set the block's minValue.
		fBlock.setMinValue(block.getMinValue());
		// Set the block's maxValue.
		fBlock.setMaxValue(block.getMaxValue());
		// Set the block's defaultValue.
		fBlock.setDefaultValue(block.getDefaultValue());
		// Set the block's noMinValue
		fBlock.setNoMinValue(block.getNoMinValue());
		// Set the block's noMaxValue
		fBlock.setNoMaxValue(block.getNoMaxValue());
		// Set the block's noDefaultValue
		fBlock.setNoDefaultValue(block.getNoDefaultValue());

		return fBlock;
	}
	
	private SelectInputBlock parseSelectInputBlock(blockModeling.Models.InputBlock block) {
	
		// Initialize Float Input Block.
		SelectInputBlock sBlock = this.factory.createSelectInputBlock();
		
		// Set the block's Image.
		sBlock.setImage(block.getImage());
		// Set the block's infoTextEL.
		sBlock.setInfoTextEL(block.getInfoTextEL());
		// Set the block's infoTextEN.
		sBlock.setInfoTextEN(block.getInfoTextEN());
		// Set the block's variableName.
		sBlock.setVariableName(block.getVariableName());
		// Set the block's Cursor.		
		switch(block.getIconCursor()) {
			case "help":
				sBlock.setIconCursor(Cursor.HELP);
				break;
			case "pointer":
				sBlock.setIconCursor(Cursor.POINTER);
				break;
			case "default":
				sBlock.setIconCursor(Cursor.DEFAULT);
				break;
			default:
				sBlock.setIconCursor(Cursor.DEFAULT);	
		}
		// Parse the block's options
		for(int i=0; i < block.getHasOptions().size(); i++) {
			sBlock.getHasOptions().add(parseOption(block.getHasOptions().get(i)));
		}		
		
		return sBlock;
	}
	
	private Option parseOption(blockModeling.Models.Option opt) {
		
		// Initialize Option.
		Option option = this.factory.createOption();
		
		// Set the option's OptionTextEL
		option.setOptionTextEL(opt.getOptionTextEL());
		// Set the option's OptionTextEN
		option.setOptionTextEN(opt.getOptionTextEN());
		
		return option;
	}
	
	private ConfigurationPopover parseConfigurationPopover(blockModeling.Models.ConfigurationPopover popover) {
		
		// Initialize Configuration Popover.
		ConfigurationPopover cPopover = this.factory.createConfigurationPopover();

		// Set the popover's popoverTitleEL.
		cPopover.setPopoverTitleEL(popover.getPopoverTitleEL());
		// Set the popover's popoverTitleEN.
		cPopover.setPopoverTitleEN(popover.getPopoverTitleEN());
		//Parse the block's Input Blocks
		for(int i=0; i < popover.getHasInput().size(); i++) {
			switch(popover.getHasInput().get(i).getType()) {
				case "text-input-block":
					cPopover.getHasInput().add(parseTextInputBlock(popover.getHasInput().get(i)));
					break;
				case "integer-input-block":
					cPopover.getHasInput().add(parseIntegerInputBlock(popover.getHasInput().get(i)));
					break;
				case "float-input-block":
					cPopover.getHasInput().add(parseFloatInputBlock(popover.getHasInput().get(i)));
					break;
				case "select-input-block":
					cPopover.getHasInput().add(parseSelectInputBlock(popover.getHasInput().get(i)));
					break;
			}
		}	
		
		return cPopover;
	}
	
	private SettingsPopover parseSettingsPopover(blockModeling.Models.SettingsPopover popover) {
		
		// Initialize Settings Popover.
		SettingsPopover sPopover = this.factory.createSettingsPopover();
		
		// Set the popover's popoverTitleEL.
		sPopover.setPopoverTitleEL(popover.getPopoverTitleEL());
		// Set the popover's popoverTitleEN.
		sPopover.setPopoverTitleEN(popover.getPopoverTitleEN());
		
		switch(popover.getHasForm().getType()) {
			case "condition-input":
				sPopover.setHasForm(parseConditionInputForm(popover.getHasForm()));
				break;
			case "parameter-input":
				sPopover.setHasForm(parseParameterInputForm(popover.getHasForm()));
				break;
			case "labeled-text-input":
				sPopover.setHasForm(parseLabeledTextInputForm(popover.getHasForm()));
				break;
			case "labeled-integer-input":
				sPopover.setHasForm(parseLabeledIntegerInputForm(popover.getHasForm()));
				break;
			case "labeled-float-input":
				sPopover.setHasForm(parseLabeledFloatInputForm(popover.getHasForm()));
				break;
			case "phrases-input":
				sPopover.setHasForm(parsePhrasesInputForm(popover.getHasForm()));
				break;
		}
		
		return sPopover;
	}
	
	private PhrasesInputForm parsePhrasesInputForm(blockModeling.Models.Form form) {
		
		// Initialize PhrasesInputForm.
		PhrasesInputForm pForm = this.factory.createPhrasesInputForm();
		
		// Set the form's placeholderEL.
		pForm.setPlaceholderEL(form.getPlaceholderEL());
		// Set the form's placeholderEN.
		pForm.setPlaceholderEN(form.getPlaceholderEN());
		
		return pForm;
	}
	
	private LabeledTextInputForm parseLabeledTextInputForm(blockModeling.Models.Form form) {
		
		// Initialize LabeledTextInputForm.
		LabeledTextInputForm lForm = this.factory.createLabeledTextInputForm();
		
		// Set the form's variableNameEL.
		lForm.setVariableNameEL(form.getVariableLabelEL());
		// Set the form's variableNameEN.
		lForm.setVariableNameEN(form.getVariableLabelEN());
		// Set the form's defaultValueEL.
		lForm.setDefaultValueEL(form.getDefaultValueEL());
		// Set the form's defaultValueEN.
		lForm.setDefaultValueEN(form.getDefaultValueEN());
		
		return lForm;
	}
	
	private LabeledFloatInputForm parseLabeledFloatInputForm(blockModeling.Models.Form form) {
		
		
		// Initialize LabeledTextInputForm.
		LabeledFloatInputForm lForm = this.factory.createLabeledFloatInputForm();
		
		// Set the form's variableNameEL.
		lForm.setVariableNameEL(form.getVariableLabelEL());
		// Set the form's variableNameEN.
		lForm.setVariableNameEN(form.getVariableLabelEN());
		// Set the form's minValue
		lForm.setMinValue(form.getMinValue());
		// Set the form's maxValue
		lForm.setMaxValue(form.getMaxValue());
		// Set the form's defaultValue
		lForm.setDefaultValue(form.getDefaultValue());
		// Set the form's noMinValue.
		lForm.setNoMinValue(form.getNoMinValue());
		// Set the form's noMaxValue.
		lForm.setNoMaxValue(form.getNoMaxValue());
		// Set the form's noDefaultValue.
		lForm.setNoDefaultValue(form.getNoDefaultValue());
		
		return lForm;
	}
	
	private LabeledIntegerInputForm parseLabeledIntegerInputForm(blockModeling.Models.Form form) {
		
		
		// Initialize LabeledTextInputForm.
		LabeledIntegerInputForm lForm = this.factory.createLabeledIntegerInputForm();
		
		// Set the form's variableNameEL.
		lForm.setVariableNameEL(form.getVariableLabelEL());
		// Set the form's variableNameEN.
		lForm.setVariableNameEN(form.getVariableLabelEN());
		// Set the form's minValue
		lForm.setMinValue((int)form.getMinValue());
		// Set the form's maxValue
		lForm.setMaxValue((int)form.getMaxValue());
		// Set the form's defaultValue
		lForm.setDefaultValue((int)form.getDefaultValue());
		// Set the form's noMinValue.
		lForm.setNoMinValue(form.getNoMinValue());
		// Set the form's noMaxValue.
		lForm.setNoMaxValue(form.getNoMaxValue());
		// Set the form's noDefaultValue.
		lForm.setNoDefaultValue(form.getNoDefaultValue());
		
		return lForm;
	}
	
	private ParameterInputForm parseParameterInputForm(blockModeling.Models.Form form) {
		
		// Initialize ParameterInputForm.
		ParameterInputForm pForm = this.factory.createParameterInputForm();
		
		// Set the form's defaultValueEL.
		pForm.setDefaultValueEL(form.getDefaultValueEL());
		// Set the form's defaultValueEN.
		pForm.setDefaultValueEN(form.getDefaultValueEN());
		
		// Parse the form's options.
		for(int i=0; i<form.getHasOptions().size();i++) {
			pForm.getHasOptions().add(parseOption(form.getHasOptions().get(i)));
		}
		
		return pForm;
	}
	
	private ConditionInputForm parseConditionInputForm(blockModeling.Models.Form form) {
		
		// Initialize ParameterInputForm.
		ConditionInputForm cForm = this.factory.createConditionInputForm();
		
		for(int i=0; i< form.getConditionHasOptions().size(); i++) {
			cForm.getHasOptions().add(parseConditionOption(form.getConditionHasOptions().get(i)));
		}
		
		return cForm;
	}
	
	private ConditionOption parseConditionOption(blockModeling.Models.ConditionOption option) {
		
		// Initialize ConditionOption.
		ConditionOption cOption = this.factory.createConditionOption();
		
		// Set Options optionTextEL.
		cOption.setOptionTextEL(option.getOptionTextEL());
		// Set Options optionTextEN.
		cOption.setOptionTextEN(option.getOptionTextEN());
		// Set the option's Comparison Type
		switch(option.getComparisonType()) {
			case "none":
				cOption.setComparisonType(ComparisonType.NONE);
				break;
			case "input":
				cOption.setComparisonType(ComparisonType.INPUT);
				break;
			case "select":
				cOption.setComparisonType(ComparisonType.SELECT);
				break;
		}
		
		if(!option.getComparisonType().equals("none")) {
			// Set the Option's Comparators.
			for(int i=0; i<option.getComparators().size(); i++) {
				cOption.getComparators().add(option.getComparators().get(i));
			}
		}
		
		if(option.getComparisonType().equals("select")) {
			for(int i=0; i<option.getHasOptions().size(); i++) {
				cOption.getHasOptions().add(parseOption(option.getHasOptions().get(i)));				
			}
		}
		
		return cOption;
	}
}
