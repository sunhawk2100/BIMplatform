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
package cn.dlb.bim.models.ifc4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Arbitrary Profile Def With Voids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cn.dlb.bim.models.ifc4.IfcArbitraryProfileDefWithVoids#getInnerCurves <em>Inner Curves</em>}</li>
 * </ul>
 *
 * @see cn.dlb.bim.models.ifc4.Ifc4Package#getIfcArbitraryProfileDefWithVoids()
 * @model
 * @generated
 */
public interface IfcArbitraryProfileDefWithVoids extends IfcArbitraryClosedProfileDef {
	/**
	 * Returns the value of the '<em><b>Inner Curves</b></em>' reference list.
	 * The list contents are of type {@link cn.dlb.bim.models.ifc4.IfcCurve}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Curves</em>' reference list.
	 * @see cn.dlb.bim.models.ifc4.Ifc4Package#getIfcArbitraryProfileDefWithVoids_InnerCurves()
	 * @model
	 * @generated
	 */
	EList<IfcCurve> getInnerCurves();

} // IfcArbitraryProfileDefWithVoids