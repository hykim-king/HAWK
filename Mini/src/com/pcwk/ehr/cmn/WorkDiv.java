package com.pcwk.ehr.cmn;

import java.util.List;

public interface WorkDiv<T> {
	
	/**
	 * 파일 쓰기
	 * @param param
	 * @return 1(성공)/0(실패)
	 */
	int writeFile(String path);
	
	/**
	 * 파일 읽기
	 * @param param
	 * @return 1(성공)/0(실패)
	 */
	int readFile(String path);

	/**
	 * 등록
	 * @param vo
	 * @return 1(성공)/0(실패)
	 */
	int doSave(T param);

	/**
	 * 수정
	 * @param param
	 * @return 1(성공)/0(실패)
	 */
	int doUpdate(T param);

	/**
	 * 삭제
	 * @param param
	 * @return 1(성공)/0(실패)
	 */
	int doDelete(T param);

	/**
	 * 회원 단건조회
	 * @param param
	 * @return MemberVO
	 */
	T doSelectOne(T param);
	
	T doSelectAll(T param);

	/**
	 * 회원 단건조회
	 * @param param
	 * @return MemberVO
	 */
	List<T> doRetrieve(DTO param);
	
	/**
	 * 식당 판매 메뉴
	 * @param param
	 * @return 
	 */
	int doReservation(T param);

}