/*Please add ; after each select statement*/
CREATE PROCEDURE projectsTeam()
BEGIN
    SELECT DISTINCT name as name
    FROM projectLog
    ORDER BY name;
END