/*
package com.constore.model.dao;

import com.constore.model.bean.Bank;

import java.util.List;

public final class Banks {
    private Banks() {
    }

    public static List<Bank> list() {
        try (SqlSession sqlSession = DatabaseConnection.getSqlSession()) {
            return sqlSession.selectList("mrmathami.tms.model.mapper.Banks.list");
        } catch (Exception ignored) {
        }
        return null;
    }

    public static Bank get(Bank bank) {
        if (bank == null || !bank.has(Bank.BANK_ID)) return null;
        try (SqlSession sqlSession = DatabaseConnection.getSqlSession()) {
            return sqlSession.selectOne("mrmathami.tms.model.mapper.Banks.get", bank);
        } catch (Exception ignored) {
        }
        return null;
    }

    public static Bank add(Bank bank) {
        if (bank == null || !bank.hasAll(Bank.BANK_ID)) return null;
        try (SqlSession sqlSession = DatabaseConnection.getSqlSession()) {
            if (sqlSession.insert("mrmathami.tms.model.mapper.Banks.add", bank) != 0 && bank.hasAll()) {
                return bank;
            }
        } catch (Exception ignored) {
        }
        return null;
    }

    public static boolean edit(Bank bank) {
        if (bank == null || !bank.hasAll()) return false;
        try (SqlSession sqlSession = DatabaseConnection.getSqlSession()) {
            return sqlSession.update("mrmathami.tms.model.mapper.Banks.edit", bank) != 0;
        } catch (Exception ignored) {
        }
        return false;
    }

    public static int delete(List<Bank> banks) {
        for (Bank bank : banks) if (!bank.has(Bank.BANK_ID)) return 0;
        try (SqlSession sqlSession = DatabaseConnection.getSqlSession()) {
            return sqlSession.delete("mrmathami.tms.model.mapper.banks.deleteList", banks);
        } catch (Exception ignored) {
        }
        return 0;
    }
}

*/
