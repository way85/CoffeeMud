package com.planet_ink.coffee_mud.Items;


import com.planet_ink.coffee_mud.interfaces.*;
import com.planet_ink.coffee_mud.common.*;
import com.planet_ink.coffee_mud.utils.*;
import java.util.*;

public class GenRideable extends StdRideable
{
	public String ID(){	return "GenRideable";}
	protected String readableText="";
	public GenRideable()
	{
		super();
		name="a generic boat";
		displayText="a generic boat sits here.";
		description="";
		baseEnvStats().setWeight(2000);
		rideBasis=Rideable.RIDEABLE_WATER;
		setMaterial(EnvResource.RESOURCE_OAK);
		recoverEnvStats();
		isReadable=false;
	}
	public Environmental newInstance()
	{
		return new GenRideable();
	}
	public boolean isGeneric(){return true;}

	public String text()
	{
		return Generic.getPropertiesStr(this,false);
	}

	public String readableText(){return readableText;}
	public void setReadableText(String text){readableText=text;}
	public void setMiscText(String newText)
	{
		miscText="";
		Generic.setPropertiesStr(this,newText,false);
		recoverEnvStats();
	}
}
