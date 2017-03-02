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

import cn.dlb.bim.emf.IdEObjectImpl;
import cn.dlb.bim.models.ifc4.Ifc4Package;
import cn.dlb.bim.models.ifc4.IfcMeasureWithUnit;
import cn.dlb.bim.models.ifc4.IfcUnit;
import cn.dlb.bim.models.ifc4.IfcValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Measure With Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcMeasureWithUnitImpl#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcMeasureWithUnitImpl#getUnitComponent <em>Unit Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcMeasureWithUnitImpl extends IdEObjectImpl implements IfcMeasureWithUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMeasureWithUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_MEASURE_WITH_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue getValueComponent() {
		return (IfcValue) eGet(Ifc4Package.Literals.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueComponent(IfcValue newValueComponent) {
		eSet(Ifc4Package.Literals.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT, newValueComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getUnitComponent() {
		return (IfcUnit) eGet(Ifc4Package.Literals.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitComponent(IfcUnit newUnitComponent) {
		eSet(Ifc4Package.Literals.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT, newUnitComponent);
	}

} //IfcMeasureWithUnitImpl