package com.roufid.tutorials;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Using Ajax in Liferay portlet tutorial.
 * 
 * @author Radouane ROUFID.
 */
public class SendData extends MVCPortlet {
 
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
		
		// Retrieving the submitted data using ParamUtil.
		String firstname = ParamUtil.getString(resourceRequest, "firstname");
		String lastname = ParamUtil.getString(resourceRequest, "lastname");
		String site = ParamUtil.getString(resourceRequest, "site");
		
		System.out.println("Firstname : "+ firstname);
		System.out.println("Lastname :" + lastname);
		System.out.println("Site : " + site);

		super.serveResource(resourceRequest, resourceResponse);
	}
}
