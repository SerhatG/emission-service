add_build_constants

cluster_tables

run_sql_folder "substances"

run_sql_folder "datasets"

synchronize_serials

$do_run_unit_tests = true unless has_build_flag :no_unittest
$do_validate_contents = true if has_build_flag :validate
$do_create_summary = true if has_build_flag :summary
