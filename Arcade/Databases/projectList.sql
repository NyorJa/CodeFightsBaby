CREATE PROCEDURE projectList()
BEGIN
	SELECT project_name, team_lead, income
FROM Projects
order BY internal_id;
END