/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cn.dlb.bim.models.ifc4.impl;

import org.eclipse.emf.ecore.EClass;

import cn.dlb.bim.models.ifc4.Ifc4Package;
import cn.dlb.bim.models.ifc4.IfcLagTime;
import cn.dlb.bim.models.ifc4.IfcTaskDurationEnum;
import cn.dlb.bim.models.ifc4.IfcTimeOrRatioSelect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Lag Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcLagTimeImpl#getLagValue <em>Lag Value</em>}</li>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcLagTimeImpl#getDurationType <em>Duration Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcLagTimeImpl extends IfcSchedulingTimeImpl implements IfcLagTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLagTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_LAG_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeOrRatioSelect getLagValue() {
		return (IfcTimeOrRatioSelect) eGet(Ifc4Package.Literals.IFC_LAG_TIME__LAG_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLagValue(IfcTimeOrRatioSelect newLagValue) {
		eSet(Ifc4Package.Literals.IFC_LAG_TIME__LAG_VALUE, newLagValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTaskDurationEnum getDurationType() {
		return (IfcTaskDurationEnum) eGet(Ifc4Package.Literals.IFC_LAG_TIME__DURATION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationType(IfcTaskDurationEnum newDurationType) {
		eSet(Ifc4Package.Literals.IFC_LAG_TIME__DURATION_TYPE, newDurationType);
	}

} //IfcLagTimeImpl