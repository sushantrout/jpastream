'''
CREATE OR REPLACE FUNCTION get_employees_by_name_prefix(prefix_param VARCHAR)
RETURNS TABLE (
    id INT,
    name VARCHAR
)
AS $$
BEGIN
    RETURN QUERY
    SELECT id, name
    FROM employees
    WHERE name LIKE prefix_param || '%';
END;
$$ LANGUAGE plpgsql;

'''
