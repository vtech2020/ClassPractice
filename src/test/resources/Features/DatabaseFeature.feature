Feature: Database SQL query Feature Scenario

@testDB
Scenario: Execute all information from Actor Table

	Given User connects to Postgress SQL Database
	When User sends query 'select * from public.actor'
	Then User should get all information from that table
	