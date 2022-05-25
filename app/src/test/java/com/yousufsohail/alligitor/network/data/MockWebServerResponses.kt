package com.yousufsohail.alligitor.network.data

object MockWebServerResponses {

    const val repositoryListResponse: String =
        "{\"total_count\":173660,\"incomplete_results\":false,\"items\":[{\"id\":133442384,\"node_id\":\"MDEwOlJlcG9zaXRvcnkxMzM0NDIzODQ=\",\"name\":\"deno\",\"full_name\":\"denoland/deno\",\"private\":false,\"owner\":{\"login\":\"denoland\",\"id\":42048915,\"node_id\":\"MDEyOk9yZ2FuaXphdGlvbjQyMDQ4OTE1\",\"avatar_url\":\"https://avatars.githubusercontent.com/u/42048915?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/denoland\",\"html_url\":\"https://github.com/denoland\",\"followers_url\":\"https://api.github.com/users/denoland/followers\",\"following_url\":\"https://api.github.com/users/denoland/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/denoland/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/denoland/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/denoland/subscriptions\",\"organizations_url\":\"https://api.github.com/users/denoland/orgs\",\"repos_url\":\"https://api.github.com/users/denoland/repos\",\"events_url\":\"https://api.github.com/users/denoland/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/denoland/received_events\",\"type\":\"Organization\",\"site_admin\":false},\"html_url\":\"https://github.com/denoland/deno\",\"description\":\"AmodernruntimeforJavaScriptandTypeScript.\",\"fork\":false,\"url\":\"https://api.github.com/repos/denoland/deno\",\"forks_url\":\"https://api.github.com/repos/denoland/deno/forks\",\"keys_url\":\"https://api.github.com/repos/denoland/deno/keys{/key_id}\",\"collaborators_url\":\"https://api.github.com/repos/denoland/deno/collaborators{/collaborator}\",\"teams_url\":\"https://api.github.com/repos/denoland/deno/teams\",\"hooks_url\":\"https://api.github.com/repos/denoland/deno/hooks\",\"issue_events_url\":\"https://api.github.com/repos/denoland/deno/issues/events{/number}\",\"events_url\":\"https://api.github.com/repos/denoland/deno/events\",\"assignees_url\":\"https://api.github.com/repos/denoland/deno/assignees{/user}\",\"branches_url\":\"https://api.github.com/repos/denoland/deno/branches{/branch}\",\"tags_url\":\"https://api.github.com/repos/denoland/deno/tags\",\"blobs_url\":\"https://api.github.com/repos/denoland/deno/git/blobs{/sha}\",\"git_tags_url\":\"https://api.github.com/repos/denoland/deno/git/tags{/sha}\",\"git_refs_url\":\"https://api.github.com/repos/denoland/deno/git/refs{/sha}\",\"trees_url\":\"https://api.github.com/repos/denoland/deno/git/trees{/sha}\",\"statuses_url\":\"https://api.github.com/repos/denoland/deno/statuses/{sha}\",\"languages_url\":\"https://api.github.com/repos/denoland/deno/languages\",\"stargazers_url\":\"https://api.github.com/repos/denoland/deno/stargazers\",\"contributors_url\":\"https://api.github.com/repos/denoland/deno/contributors\",\"subscribers_url\":\"https://api.github.com/repos/denoland/deno/subscribers\",\"subscription_url\":\"https://api.github.com/repos/denoland/deno/subscription\",\"commits_url\":\"https://api.github.com/repos/denoland/deno/commits{/sha}\",\"git_commits_url\":\"https://api.github.com/repos/denoland/deno/git/commits{/sha}\",\"comments_url\":\"https://api.github.com/repos/denoland/deno/comments{/number}\",\"issue_comment_url\":\"https://api.github.com/repos/denoland/deno/issues/comments{/number}\",\"contents_url\":\"https://api.github.com/repos/denoland/deno/contents/{+path}\",\"compare_url\":\"https://api.github.com/repos/denoland/deno/compare/{base}...{head}\",\"merges_url\":\"https://api.github.com/repos/denoland/deno/merges\",\"archive_url\":\"https://api.github.com/repos/denoland/deno/{archive_format}{/ref}\",\"downloads_url\":\"https://api.github.com/repos/denoland/deno/downloads\",\"issues_url\":\"https://api.github.com/repos/denoland/deno/issues{/number}\",\"pulls_url\":\"https://api.github.com/repos/denoland/deno/pulls{/number}\",\"milestones_url\":\"https://api.github.com/repos/denoland/deno/milestones{/number}\",\"notifications_url\":\"https://api.github.com/repos/denoland/deno/notifications{?since,all,participating}\",\"labels_url\":\"https://api.github.com/repos/denoland/deno/labels{/name}\",\"releases_url\":\"https://api.github.com/repos/denoland/deno/releases{/id}\",\"deployments_url\":\"https://api.github.com/repos/denoland/deno/deployments\",\"created_at\":\"2018-05-15T01:34:26Z\",\"updated_at\":\"2022-05-25T05:55:28Z\",\"pushed_at\":\"2022-05-25T01:28:05Z\",\"git_url\":\"git://github.com/denoland/deno.git\",\"ssh_url\":\"git@github.com:denoland/deno.git\",\"clone_url\":\"https://github.com/denoland/deno.git\",\"svn_url\":\"https://github.com/denoland/deno\",\"homepage\":\"https://deno.land\",\"size\":60675,\"stargazers_count\":82592,\"watchers_count\":82592,\"language\":\"Rust\",\"has_issues\":true,\"has_projects\":false,\"has_downloads\":true,\"has_wiki\":true,\"has_pages\":false,\"forks_count\":4435,\"mirror_url\":null,\"archived\":false,\"disabled\":false,\"open_issues_count\":960,\"license\":{\"key\":\"mit\",\"name\":\"MITLicense\",\"spdx_id\":\"MIT\",\"url\":\"https://api.github.com/licenses/mit\",\"node_id\":\"MDc6TGljZW5zZTEz\"},\"allow_forking\":true,\"is_template\":false,\"topics\":[\"deno\",\"javascript\",\"rust\",\"typescript\"],\"visibility\":\"public\",\"forks\":4435,\"open_issues\":960,\"watchers\":82592,\"default_branch\":\"main\",\"score\":1.0},{\"id\":20929025,\"node_id\":\"MDEwOlJlcG9zaXRvcnkyMDkyOTAyNQ==\",\"name\":\"TypeScript\",\"full_name\":\"microsoft/TypeScript\",\"private\":false,\"owner\":{\"login\":\"microsoft\",\"id\":6154722,\"node_id\":\"MDEyOk9yZ2FuaXphdGlvbjYxNTQ3MjI=\",\"avatar_url\":\"https://avatars.githubusercontent.com/u/6154722?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/microsoft\",\"html_url\":\"https://github.com/microsoft\",\"followers_url\":\"https://api.github.com/users/microsoft/followers\",\"following_url\":\"https://api.github.com/users/microsoft/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/microsoft/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/microsoft/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/microsoft/subscriptions\",\"organizations_url\":\"https://api.github.com/users/microsoft/orgs\",\"repos_url\":\"https://api.github.com/users/microsoft/repos\",\"events_url\":\"https://api.github.com/users/microsoft/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/microsoft/received_events\",\"type\":\"Organization\",\"site_admin\":false},\"html_url\":\"https://github.com/microsoft/TypeScript\",\"description\":\"TypeScriptisasupersetofJavaScriptthatcompilestocleanJavaScriptoutput.\",\"fork\":false,\"url\":\"https://api.github.com/repos/microsoft/TypeScript\",\"forks_url\":\"https://api.github.com/repos/microsoft/TypeScript/forks\",\"keys_url\":\"https://api.github.com/repos/microsoft/TypeScript/keys{/key_id}\",\"collaborators_url\":\"https://api.github.com/repos/microsoft/TypeScript/collaborators{/collaborator}\",\"teams_url\":\"https://api.github.com/repos/microsoft/TypeScript/teams\",\"hooks_url\":\"https://api.github.com/repos/microsoft/TypeScript/hooks\",\"issue_events_url\":\"https://api.github.com/repos/microsoft/TypeScript/issues/events{/number}\",\"events_url\":\"https://api.github.com/repos/microsoft/TypeScript/events\",\"assignees_url\":\"https://api.github.com/repos/microsoft/TypeScript/assignees{/user}\",\"branches_url\":\"https://api.github.com/repos/microsoft/TypeScript/branches{/branch}\",\"tags_url\":\"https://api.github.com/repos/microsoft/TypeScript/tags\",\"blobs_url\":\"https://api.github.com/repos/microsoft/TypeScript/git/blobs{/sha}\",\"git_tags_url\":\"https://api.github.com/repos/microsoft/TypeScript/git/tags{/sha}\",\"git_refs_url\":\"https://api.github.com/repos/microsoft/TypeScript/git/refs{/sha}\",\"trees_url\":\"https://api.github.com/repos/microsoft/TypeScript/git/trees{/sha}\",\"statuses_url\":\"https://api.github.com/repos/microsoft/TypeScript/statuses/{sha}\",\"languages_url\":\"https://api.github.com/repos/microsoft/TypeScript/languages\",\"stargazers_url\":\"https://api.github.com/repos/microsoft/TypeScript/stargazers\",\"contributors_url\":\"https://api.github.com/repos/microsoft/TypeScript/contributors\",\"subscribers_url\":\"https://api.github.com/repos/microsoft/TypeScript/subscribers\",\"subscription_url\":\"https://api.github.com/repos/microsoft/TypeScript/subscription\",\"commits_url\":\"https://api.github.com/repos/microsoft/TypeScript/commits{/sha}\",\"git_commits_url\":\"https://api.github.com/repos/microsoft/TypeScript/git/commits{/sha}\",\"comments_url\":\"https://api.github.com/repos/microsoft/TypeScript/comments{/number}\",\"issue_comment_url\":\"https://api.github.com/repos/microsoft/TypeScript/issues/comments{/number}\",\"contents_url\":\"https://api.github.com/repos/microsoft/TypeScript/contents/{+path}\",\"compare_url\":\"https://api.github.com/repos/microsoft/TypeScript/compare/{base}...{head}\",\"merges_url\":\"https://api.github.com/repos/microsoft/TypeScript/merges\",\"archive_url\":\"https://api.github.com/repos/microsoft/TypeScript/{archive_format}{/ref}\",\"downloads_url\":\"https://api.github.com/repos/microsoft/TypeScript/downloads\",\"issues_url\":\"https://api.github.com/repos/microsoft/TypeScript/issues{/number}\",\"pulls_url\":\"https://api.github.com/repos/microsoft/TypeScript/pulls{/number}\",\"milestones_url\":\"https://api.github.com/repos/microsoft/TypeScript/milestones{/number}\",\"notifications_url\":\"https://api.github.com/repos/microsoft/TypeScript/notifications{?since,all,participating}\",\"labels_url\":\"https://api.github.com/repos/microsoft/TypeScript/labels{/name}\",\"releases_url\":\"https://api.github.com/repos/microsoft/TypeScript/releases{/id}\",\"deployments_url\":\"https://api.github.com/repos/microsoft/TypeScript/deployments\",\"created_at\":\"2014-06-17T15:28:39Z\",\"updated_at\":\"2022-05-25T07:15:58Z\",\"pushed_at\":\"2022-05-25T02:30:51Z\",\"git_url\":\"git://github.com/microsoft/TypeScript.git\",\"ssh_url\":\"git@github.com:microsoft/TypeScript.git\",\"clone_url\":\"https://github.com/microsoft/TypeScript.git\",\"svn_url\":\"https://github.com/microsoft/TypeScript\",\"homepage\":\"https://www.typescriptlang.org\",\"size\":1789849,\"stargazers_count\":80873,\"watchers_count\":80873,\"language\":\"TypeScript\",\"has_issues\":true,\"has_projects\":true,\"has_downloads\":true,\"has_wiki\":true,\"has_pages\":false,\"forks_count\":10575,\"mirror_url\":null,\"archived\":false,\"disabled\":false,\"open_issues_count\":5523,\"license\":{\"key\":\"apache-2.0\",\"name\":\"ApacheLicense2.0\",\"spdx_id\":\"Apache-2.0\",\"url\":\"https://api.github.com/licenses/apache-2.0\",\"node_id\":\"MDc6TGljZW5zZTI=\"},\"allow_forking\":true,\"is_template\":false,\"topics\":[\"javascript\",\"language\",\"typechecker\",\"typescript\"],\"visibility\":\"public\",\"forks\":10575,\"open_issues\":5523,\"watchers\":80873,\"default_branch\":\"main\",\"score\":1.0}]}"

}
