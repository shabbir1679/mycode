#
# Cookbook:: apache_base
# Recipe:: default
#
# Copyright:: 2018, The Authors, All Rights Reserved.
package 'httpd' do
  action :install
end
service 'ntp' do
  action [:enable, :start]
end
