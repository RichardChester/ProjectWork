<template>
    <div>

        <b-navbar toggleable="md" type="dark" variant="info">

            <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

            <b-navbar-brand href="#">Project App</b-navbar-brand>

            <b-collapse is-nav id="nav_collapse">



                <!-- Right aligned nav items -->
                <b-navbar-nav class="m-auto">



                    <b-nav-item-dropdown text="Dashboard" Left>
                        <b-dropdown-item href="#">open space</b-dropdown-item>
                        <b-dropdown-item href="#">open space</b-dropdown-item>

                    </b-nav-item-dropdown>

                    <b-nav-item-dropdown text="Account" Left>
                        <b-dropdown-item href="#/GetAccount">Get account</b-dropdown-item>
                        <b-dropdown-item href="#/CreateAccount">Create_account</b-dropdown-item>


                    </b-nav-item-dropdown>


                </b-navbar-nav>

            </b-collapse>
        </b-navbar>
    </div>
</template>

<script>
    export default {
        name: "navBar"
    }

</script>

<style scoped>

</style>