/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2016 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Data Instance In Swc Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx#getAlignmentTypeEx <em>Alignment Type Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getVariableDataInstanceInSwcEx()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface VariableDataInstanceInSwcEx extends ExtendedEObject {

	/**
	 * Returns the value of the '<em><b>Alignment Type Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment Type Ex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment Type Ex</em>' reference.
	 * @see #setAlignmentTypeEx(AlignmentTypeEx)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getVariableDataInstanceInSwcEx_AlignmentTypeEx()
	 * @model required="true"
	 * @generated
	 */
	AlignmentTypeEx getAlignmentTypeEx();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx#getAlignmentTypeEx <em>Alignment Type Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment Type Ex</em>' reference.
	 * @see #getAlignmentTypeEx()
	 * @generated
	 */
	void setAlignmentTypeEx(AlignmentTypeEx value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 初期値定数を提供するか
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not this_.isEventSemantics()'"
	 * @generated
	 */
	boolean providesInitValueConstant(VariableDataInstanceInSwc this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * メモリマッピングのための10進数表記のアラインメントの値，もしくは規定の文字列（'UNKNOWN', 'UNSPECIFIED', 'BOOLEAN')を取得する．
	 * <!-- end-model-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AlignmentType" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let swAlignment : String = this_.getSwAlignment(), baseType : m2::SwBaseType = this_.getBaseType() in\n\t\t\t\t\tif not swAlignment.oclIsUndefined()\n\t\t\t\t\t\tthen alignmentTypeEx.getMemoryMappingAlignment(swAlignment)\n\t\t\t\t\telse if not baseType.baseTypeSize.oclIsUndefined()\n\t\t\t\t\t\tthen baseType.baseTypeSize.toString()\n\t\t\t\t\t\telse null\n\t\t\t\t\tendif endif'"
	 * @generated
	 */
	String getMemoryMappingAlignment(VariableDataInstanceInSwc this_);

} // VariableDataInstanceInSwcEx
