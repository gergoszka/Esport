//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.23 at 04:53:05 PM CET 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClientMissionControlPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClientCommandsPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgentIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgentMissionControlPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgentVideoPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgentDepthPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgentLuminancePort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgentObservationsPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgentRewardsPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgentColourMapPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientIPAddress",
    "clientMissionControlPort",
    "clientCommandsPort",
    "agentIPAddress",
    "agentMissionControlPort",
    "agentVideoPort",
    "agentDepthPort",
    "agentLuminancePort",
    "agentObservationsPort",
    "agentRewardsPort",
    "agentColourMapPort"
})
@XmlRootElement(name = "ClientAgentConnection")
public class ClientAgentConnection {

    @XmlElement(name = "ClientIPAddress", required = true)
    protected String clientIPAddress;
    @XmlElement(name = "ClientMissionControlPort")
    protected int clientMissionControlPort;
    @XmlElement(name = "ClientCommandsPort")
    protected int clientCommandsPort;
    @XmlElement(name = "AgentIPAddress", required = true)
    protected String agentIPAddress;
    @XmlElement(name = "AgentMissionControlPort")
    protected int agentMissionControlPort;
    @XmlElement(name = "AgentVideoPort")
    protected int agentVideoPort;
    @XmlElement(name = "AgentDepthPort")
    protected int agentDepthPort;
    @XmlElement(name = "AgentLuminancePort")
    protected int agentLuminancePort;
    @XmlElement(name = "AgentObservationsPort")
    protected int agentObservationsPort;
    @XmlElement(name = "AgentRewardsPort")
    protected int agentRewardsPort;
    @XmlElement(name = "AgentColourMapPort")
    protected int agentColourMapPort;

    /**
     * Gets the value of the clientIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIPAddress() {
        return clientIPAddress;
    }

    /**
     * Sets the value of the clientIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIPAddress(String value) {
        this.clientIPAddress = value;
    }

    /**
     * Gets the value of the clientMissionControlPort property.
     * 
     */
    public int getClientMissionControlPort() {
        return clientMissionControlPort;
    }

    /**
     * Sets the value of the clientMissionControlPort property.
     * 
     */
    public void setClientMissionControlPort(int value) {
        this.clientMissionControlPort = value;
    }

    /**
     * Gets the value of the clientCommandsPort property.
     * 
     */
    public int getClientCommandsPort() {
        return clientCommandsPort;
    }

    /**
     * Sets the value of the clientCommandsPort property.
     * 
     */
    public void setClientCommandsPort(int value) {
        this.clientCommandsPort = value;
    }

    /**
     * Gets the value of the agentIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentIPAddress() {
        return agentIPAddress;
    }

    /**
     * Sets the value of the agentIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentIPAddress(String value) {
        this.agentIPAddress = value;
    }

    /**
     * Gets the value of the agentMissionControlPort property.
     * 
     */
    public int getAgentMissionControlPort() {
        return agentMissionControlPort;
    }

    /**
     * Sets the value of the agentMissionControlPort property.
     * 
     */
    public void setAgentMissionControlPort(int value) {
        this.agentMissionControlPort = value;
    }

    /**
     * Gets the value of the agentVideoPort property.
     * 
     */
    public int getAgentVideoPort() {
        return agentVideoPort;
    }

    /**
     * Sets the value of the agentVideoPort property.
     * 
     */
    public void setAgentVideoPort(int value) {
        this.agentVideoPort = value;
    }

    /**
     * Gets the value of the agentDepthPort property.
     * 
     */
    public int getAgentDepthPort() {
        return agentDepthPort;
    }

    /**
     * Sets the value of the agentDepthPort property.
     * 
     */
    public void setAgentDepthPort(int value) {
        this.agentDepthPort = value;
    }

    /**
     * Gets the value of the agentLuminancePort property.
     * 
     */
    public int getAgentLuminancePort() {
        return agentLuminancePort;
    }

    /**
     * Sets the value of the agentLuminancePort property.
     * 
     */
    public void setAgentLuminancePort(int value) {
        this.agentLuminancePort = value;
    }

    /**
     * Gets the value of the agentObservationsPort property.
     * 
     */
    public int getAgentObservationsPort() {
        return agentObservationsPort;
    }

    /**
     * Sets the value of the agentObservationsPort property.
     * 
     */
    public void setAgentObservationsPort(int value) {
        this.agentObservationsPort = value;
    }

    /**
     * Gets the value of the agentRewardsPort property.
     * 
     */
    public int getAgentRewardsPort() {
        return agentRewardsPort;
    }

    /**
     * Sets the value of the agentRewardsPort property.
     * 
     */
    public void setAgentRewardsPort(int value) {
        this.agentRewardsPort = value;
    }

    /**
     * Gets the value of the agentColourMapPort property.
     * 
     */
    public int getAgentColourMapPort() {
        return agentColourMapPort;
    }

    /**
     * Sets the value of the agentColourMapPort property.
     * 
     */
    public void setAgentColourMapPort(int value) {
        this.agentColourMapPort = value;
    }

}
