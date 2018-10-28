INSERT INTO appuser(userId, userName, encryptedpassword, enabled)
VALUES (2, 'dbuser1', '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 1);
 
INSERT INTO appuser(userId, userName, encryptedpassword, enabled)
VALUES (1, 'dbadmin1', '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 1);

---
 
INSERT INTO approle (ROLEID, ROLENAME)
VALUES (1, 'ROLE_ADMIN');
 
INSERT INTO approle (ROLEID, ROLENAME)
VALUES (2, 'ROLE_USER');
 
---
 
INSERT INTO userrole (ID, USERID, ROLEID)
VALUES (1, 1, 1);
 
INSERT INTO userrole (ID, USERID, ROLEID)
VALUES (2, 1, 2);
 
INSERT INTO userrole (ID, USERID, ROLEID)
VALUES (3, 2, 2);
---
COMMIT;