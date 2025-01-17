//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.18 at 08:57:29 AM CEST 
//


package org.woped.file.yawl.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalTaskFactsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalTaskFactsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.yawlfoundation.org/yawlschema}ExternalNetElementFactsType">
 *       &lt;sequence>
 *         &lt;element name="join" type="{http://www.yawlfoundation.org/yawlschema}ControlTypeType"/>
 *         &lt;element name="split" type="{http://www.yawlfoundation.org/yawlschema}ControlTypeType"/>
 *         &lt;element name="defaultConfiguration" type="{http://www.yawlfoundation.org/yawlschema}ConfigurationType" minOccurs="0"/>
 *         &lt;element name="configuration" type="{http://www.yawlfoundation.org/yawlschema}ConfigurationType" minOccurs="0"/>
 *         &lt;element name="removesTokens" type="{http://www.yawlfoundation.org/yawlschema}ExternalNetElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="removesTokensFromFlow" type="{http://www.yawlfoundation.org/yawlschema}RemovesTokensFromFlowType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startingMappings" type="{http://www.yawlfoundation.org/yawlschema}VarMappingSetType" minOccurs="0"/>
 *         &lt;element name="completedMappings" type="{http://www.yawlfoundation.org/yawlschema}VarMappingSetType" minOccurs="0"/>
 *         &lt;element name="enablementMappings" type="{http://www.yawlfoundation.org/yawlschema}VarMappingSetType" minOccurs="0"/>
 *         &lt;element name="timer" type="{http://www.yawlfoundation.org/yawlschema}TimerType" minOccurs="0"/>
 *         &lt;element name="resourcing" type="{http://www.yawlfoundation.org/yawlschema}ResourcingFactsType" minOccurs="0"/>
 *         &lt;element name="customForm" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="decomposesTo" type="{http://www.yawlfoundation.org/yawlschema}DecompositionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalTaskFactsType", propOrder = {
    "join",
    "split",
    "defaultConfiguration",
    "configuration",
    "removesTokens",
    "removesTokensFromFlow",
    "startingMappings",
    "completedMappings",
    "enablementMappings",
    "timer",
    "resourcing",
    "customForm",
    "decomposesTo"
})
@XmlSeeAlso({
    MultipleInstanceExternalTaskFactsType.class
})
public class ExternalTaskFactsType
    extends ExternalNetElementFactsType
{

    @XmlElement(required = true)
    protected ControlTypeType join;
    @XmlElement(required = true)
    protected ControlTypeType split;
    protected ConfigurationType defaultConfiguration;
    protected ConfigurationType configuration;
    protected List<ExternalNetElementType> removesTokens;
    protected List<RemovesTokensFromFlowType> removesTokensFromFlow;
    protected VarMappingSetType startingMappings;
    protected VarMappingSetType completedMappings;
    protected VarMappingSetType enablementMappings;
    protected TimerType timer;
    protected ResourcingFactsType resourcing;
    @XmlSchemaType(name = "anyURI")
    protected String customForm;
    protected DecompositionType decomposesTo;

    /**
     * Gets the value of the join property.
     * 
     * @return
     *     possible object is
     *     {@link ControlTypeType }
     *     
     */
    public ControlTypeType getJoin() {
        return join;
    }

    /**
     * Sets the value of the join property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlTypeType }
     *     
     */
    public void setJoin(ControlTypeType value) {
        this.join = value;
    }

    /**
     * Gets the value of the split property.
     * 
     * @return
     *     possible object is
     *     {@link ControlTypeType }
     *     
     */
    public ControlTypeType getSplit() {
        return split;
    }

    /**
     * Sets the value of the split property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlTypeType }
     *     
     */
    public void setSplit(ControlTypeType value) {
        this.split = value;
    }

    /**
     * Gets the value of the defaultConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationType }
     *     
     */
    public ConfigurationType getDefaultConfiguration() {
        return defaultConfiguration;
    }

    /**
     * Sets the value of the defaultConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationType }
     *     
     */
    public void setDefaultConfiguration(ConfigurationType value) {
        this.defaultConfiguration = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationType }
     *     
     */
    public ConfigurationType getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationType }
     *     
     */
    public void setConfiguration(ConfigurationType value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the removesTokens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removesTokens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovesTokens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalNetElementType }
     * 
     * 
     */
    public List<ExternalNetElementType> getRemovesTokens() {
        if (removesTokens == null) {
            removesTokens = new ArrayList<ExternalNetElementType>();
        }
        return this.removesTokens;
    }

    /**
     * Gets the value of the removesTokensFromFlow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removesTokensFromFlow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovesTokensFromFlow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemovesTokensFromFlowType }
     * 
     * 
     */
    public List<RemovesTokensFromFlowType> getRemovesTokensFromFlow() {
        if (removesTokensFromFlow == null) {
            removesTokensFromFlow = new ArrayList<RemovesTokensFromFlowType>();
        }
        return this.removesTokensFromFlow;
    }

    /**
     * Gets the value of the startingMappings property.
     * 
     * @return
     *     possible object is
     *     {@link VarMappingSetType }
     *     
     */
    public VarMappingSetType getStartingMappings() {
        return startingMappings;
    }

    /**
     * Sets the value of the startingMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarMappingSetType }
     *     
     */
    public void setStartingMappings(VarMappingSetType value) {
        this.startingMappings = value;
    }

    /**
     * Gets the value of the completedMappings property.
     * 
     * @return
     *     possible object is
     *     {@link VarMappingSetType }
     *     
     */
    public VarMappingSetType getCompletedMappings() {
        return completedMappings;
    }

    /**
     * Sets the value of the completedMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarMappingSetType }
     *     
     */
    public void setCompletedMappings(VarMappingSetType value) {
        this.completedMappings = value;
    }

    /**
     * Gets the value of the enablementMappings property.
     * 
     * @return
     *     possible object is
     *     {@link VarMappingSetType }
     *     
     */
    public VarMappingSetType getEnablementMappings() {
        return enablementMappings;
    }

    /**
     * Sets the value of the enablementMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarMappingSetType }
     *     
     */
    public void setEnablementMappings(VarMappingSetType value) {
        this.enablementMappings = value;
    }

    /**
     * Gets the value of the timer property.
     * 
     * @return
     *     possible object is
     *     {@link TimerType }
     *     
     */
    public TimerType getTimer() {
        return timer;
    }

    /**
     * Sets the value of the timer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimerType }
     *     
     */
    public void setTimer(TimerType value) {
        this.timer = value;
    }

    /**
     * Gets the value of the resourcing property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcingFactsType }
     *     
     */
    public ResourcingFactsType getResourcing() {
        return resourcing;
    }

    /**
     * Sets the value of the resourcing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcingFactsType }
     *     
     */
    public void setResourcing(ResourcingFactsType value) {
        this.resourcing = value;
    }

    /**
     * Gets the value of the customForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomForm() {
        return customForm;
    }

    /**
     * Sets the value of the customForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomForm(String value) {
        this.customForm = value;
    }

    /**
     * Gets the value of the decomposesTo property.
     * 
     * @return
     *     possible object is
     *     {@link DecompositionType }
     *     
     */
    public DecompositionType getDecomposesTo() {
        return decomposesTo;
    }

    /**
     * Sets the value of the decomposesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecompositionType }
     *     
     */
    public void setDecomposesTo(DecompositionType value) {
        this.decomposesTo = value;
    }

}
