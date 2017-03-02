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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import cn.dlb.bim.emf.IdEObjectImpl;
import cn.dlb.bim.models.ifc4.Ifc4Package;
import cn.dlb.bim.models.ifc4.IfcLightDistributionCurveEnum;
import cn.dlb.bim.models.ifc4.IfcLightDistributionData;
import cn.dlb.bim.models.ifc4.IfcLightIntensityDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Intensity Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcLightIntensityDistributionImpl#getLightDistributionCurve <em>Light Distribution Curve</em>}</li>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcLightIntensityDistributionImpl#getDistributionData <em>Distribution Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcLightIntensityDistributionImpl extends IdEObjectImpl implements IfcLightIntensityDistribution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightIntensityDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_LIGHT_INTENSITY_DISTRIBUTION;
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
	public IfcLightDistributionCurveEnum getLightDistributionCurve() {
		return (IfcLightDistributionCurveEnum) eGet(Ifc4Package.Literals.IFC_LIGHT_INTENSITY_DISTRIBUTION__LIGHT_DISTRIBUTION_CURVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightDistributionCurve(IfcLightDistributionCurveEnum newLightDistributionCurve) {
		eSet(Ifc4Package.Literals.IFC_LIGHT_INTENSITY_DISTRIBUTION__LIGHT_DISTRIBUTION_CURVE, newLightDistributionCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcLightDistributionData> getDistributionData() {
		return (EList<IfcLightDistributionData>) eGet(Ifc4Package.Literals.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA, true);
	}

} //IfcLightIntensityDistributionImpl