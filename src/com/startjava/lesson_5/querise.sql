SELECT * FROM jaegers;
SELECT * FROM jaegers WHERE status = 'ok';
SELECT * FROM jaegers WHERE mark IN ('6', '1');
SELECT * FROM jaegers ORDER BY mark DESC;
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);
SELECT * FROM jaegers WHERE kaijukill = (SELECT MIN(kaijukill) FROM jaegers);
SELECT * FROM jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM jaegers);
SELECT AVG(weight) FROM jaegers;
UPDATE Jaegers SET kaijukill = kaijukill + 1 WHERE status = 'ok';
DELETE FROM jaegers WHERE status = 'destr';