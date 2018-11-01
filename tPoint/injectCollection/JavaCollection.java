package com.tPoint.injectCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	private List addressList;
	private List<?> mainList = new ArrayList<>();
	private Set addressSet;
	private Map addressMap;
	private Properties addressProp;

	/**
	 * @return the addressList
	 */
	public List getAddressList() {
		System.out.println("List Elements :" + addressList);
		return addressList;
	}

	/**
	 * @return the addressSet
	 */
	public Set getAddressSet() {
		System.out.println("Set Elements :" + addressSet);
		return addressSet;
	}

	/**
	 * @return the addressMap
	 */
	public Map getAddressMap() {
		System.out.println("Map Elements :" + addressMap);
		return addressMap;
	}

	/**
	 * @return the addressProp
	 */
	public Properties getAddressProp() {
		System.out.println("Property Elements :" + addressProp);
		return addressProp;
	}

	/**
	 * @param addressList
	 *            the addressList to set
	 */
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	/**
	 * @param addressSet
	 *            the addressSet to set
	 */
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	/**
	 * @param addressMap
	 *            the addressMap to set
	 */
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	/**
	 * @param addressProp
	 *            the addressProp to set
	 */
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

	/**
	 * @return the mainList
	 */
	public List<?> getMainList() {
		System.out.println("Main List Elements: " + mainList);
		return mainList;
	}

	/**
	 * @param mainList
	 *            the mainList to set
	 */
	public void setMainList(List<?> mainList) {
		this.mainList = mainList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JavaCollection [mainList=" + mainList + "]";
	}

}
