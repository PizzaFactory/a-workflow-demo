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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SourceFile;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage
 * @generated
 */
public class RteTestSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RteTestPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTestSwitch() {
		if (modelPackage == null) {
			modelPackage = RteTestPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RteTestPackage.RTE_TEST_MODULE: {
				RteTestModule rteTestModule = (RteTestModule)theEObject;
				T result = caseRteTestModule(rteTestModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RteTestPackage.OS_STUB_HEADER: {
				OsStubHeader osStubHeader = (OsStubHeader)theEObject;
				T result = caseOsStubHeader(osStubHeader);
				if (result == null) result = caseHeaderFile(osStubHeader);
				if (result == null) result = caseFile(osStubHeader);
				if (result == null) result = caseModuleReferrable(osStubHeader);
				if (result == null) result = caseModuleObject(osStubHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RteTestPackage.COM_STUB_HEADER: {
				ComStubHeader comStubHeader = (ComStubHeader)theEObject;
				T result = caseComStubHeader(comStubHeader);
				if (result == null) result = caseHeaderFile(comStubHeader);
				if (result == null) result = caseFile(comStubHeader);
				if (result == null) result = caseModuleReferrable(comStubHeader);
				if (result == null) result = caseModuleObject(comStubHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RteTestPackage.IOC_MOCK_HEADER: {
				IocMockHeader iocMockHeader = (IocMockHeader)theEObject;
				T result = caseIocMockHeader(iocMockHeader);
				if (result == null) result = caseHeaderFile(iocMockHeader);
				if (result == null) result = caseFile(iocMockHeader);
				if (result == null) result = caseModuleReferrable(iocMockHeader);
				if (result == null) result = caseModuleObject(iocMockHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RteTestPackage.SWC_MOCK_HEADER: {
				SwcMockHeader swcMockHeader = (SwcMockHeader)theEObject;
				T result = caseSwcMockHeader(swcMockHeader);
				if (result == null) result = caseHeaderFile(swcMockHeader);
				if (result == null) result = caseFile(swcMockHeader);
				if (result == null) result = caseModuleReferrable(swcMockHeader);
				if (result == null) result = caseModuleObject(swcMockHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RteTestPackage.RTE_TEST_ROOT: {
				RteTestRoot rteTestRoot = (RteTestRoot)theEObject;
				T result = caseRteTestRoot(rteTestRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RteTestPackage.IOC_MOCK_SOURCE: {
				IocMockSource iocMockSource = (IocMockSource)theEObject;
				T result = caseIocMockSource(iocMockSource);
				if (result == null) result = caseSourceFile(iocMockSource);
				if (result == null) result = caseFile(iocMockSource);
				if (result == null) result = caseModuleReferrable(iocMockSource);
				if (result == null) result = caseModuleObject(iocMockSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RteTestPackage.SWC_MOCK_SOURCE: {
				SwcMockSource swcMockSource = (SwcMockSource)theEObject;
				T result = caseSwcMockSource(swcMockSource);
				if (result == null) result = caseSourceFile(swcMockSource);
				if (result == null) result = caseFile(swcMockSource);
				if (result == null) result = caseModuleReferrable(swcMockSource);
				if (result == null) result = caseModuleObject(swcMockSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RteTestPackage.RTE_TEST: {
				RteTest rteTest = (RteTest)theEObject;
				T result = caseRteTest(rteTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RteTestPackage.BSWM_MOCK_HEADER: {
				BswmMockHeader bswmMockHeader = (BswmMockHeader)theEObject;
				T result = caseBswmMockHeader(bswmMockHeader);
				if (result == null) result = caseHeaderFile(bswmMockHeader);
				if (result == null) result = caseFile(bswmMockHeader);
				if (result == null) result = caseModuleReferrable(bswmMockHeader);
				if (result == null) result = caseModuleObject(bswmMockHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RteTestPackage.BSWM_MOCK_SOURCE: {
				BswmMockSource bswmMockSource = (BswmMockSource)theEObject;
				T result = caseBswmMockSource(bswmMockSource);
				if (result == null) result = caseSourceFile(bswmMockSource);
				if (result == null) result = caseFile(bswmMockSource);
				if (result == null) result = caseModuleReferrable(bswmMockSource);
				if (result == null) result = caseModuleObject(bswmMockSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteTestModule(RteTestModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Stub Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Stub Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsStubHeader(OsStubHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Stub Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Stub Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComStubHeader(ComStubHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Mock Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Mock Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocMockHeader(IocMockHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swc Mock Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swc Mock Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwcMockHeader(SwcMockHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteTestRoot(RteTestRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Mock Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Mock Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocMockSource(IocMockSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swc Mock Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swc Mock Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwcMockSource(SwcMockSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteTest(RteTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bswm Mock Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bswm Mock Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswmMockHeader(BswmMockHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bswm Mock Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bswm Mock Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswmMockSource(BswmMockSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleObject(ModuleObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleReferrable(ModuleReferrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderFile(HeaderFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceFile(SourceFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RteTestSwitch
